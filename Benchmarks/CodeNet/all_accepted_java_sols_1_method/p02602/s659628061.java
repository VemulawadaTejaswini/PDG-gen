

import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] lines = line.split(" ");
		int N = Integer.parseInt(lines[0]);
		int K = Integer.parseInt(lines[1]);

		line = sc.nextLine();
		lines = line.split(" ");
		long[] M = new long[N];

		for(int i = 0; i < N; i++) {
			M[i] = Integer.parseInt(lines[i]);
		}

		for(int i = K; i < N; i++) {

			if(M[i-K] < M[i]) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}

		}
	}

}
