import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		int k = sc.nextInt();
		long[] score = new long[n];
		for (int i = 0; i < score.length; i++) {
			score[i] = sc.nextLong();
		}

		new Main().execute(n, k, score);
	}

	private void execute(int n, int k, long[] score) {
		for (int i = 0; i < n - k; i++) {
			long scorePrev = score[i];
			long scoreNext = score[i + k];
			if (scorePrev < scoreNext) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}
}