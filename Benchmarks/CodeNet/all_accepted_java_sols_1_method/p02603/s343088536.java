

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		int N = Integer.parseInt(line);
		long money = 1000;

		line = sc.nextLine();
		String[] lines = line.split(" ");
		int[] A = new int[N+1];
		int min = 201;
		int max = -1;

		for (int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(lines[i]);
		}

		long kabu = 0;
		for (int i = 0; i < N - 1; i++) {
			kabu = 0;
			if (A[i] < A[i + 1]) {
				kabu = money / A[i];
			}
			money = money + (A[i + 1] - A[i]) * kabu;
		}
		System.out.println(money);
	}

}
