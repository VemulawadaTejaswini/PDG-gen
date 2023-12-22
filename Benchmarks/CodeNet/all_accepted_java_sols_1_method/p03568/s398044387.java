import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int con = 1;


		for (int i = 0; i < N; i++) {
			int target = sc.nextInt();
			if (target % 2 == 0) {
				con *= 2;
			}else {
				con *= 1;
			}
		}

		System.out.println((int)Math.pow(3, N) - con);
	}
}
