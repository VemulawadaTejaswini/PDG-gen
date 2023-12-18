

import java.util.Scanner;

public class Main {

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


		long prefer = 1;
		long now = 1;
		for(int i = 0; i < K; i++) {
			prefer = prefer * M[i];
		}

		for(int i = K; i < N; i++) {
			now = prefer * M[i] / M[i - K];

			if(prefer < now) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}

			prefer = now;
		}
	}

}
