package yujin.calendar;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.print("두 수를 입력해 주세요 : ");
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println(a + " + " + b + " =  " + (a+b));
		sc.close();
		
		
	}
}
