//package sample;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		int A, B, C;
		int count = 0;

		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();

		for(int i = 1; i < C + 1; i++) {
			if(A * i <= B) {
				count++;
			}
		}
		System.out.println(count);
	}

}
