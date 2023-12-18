

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] lines = line.split(" ");
		int N = Integer.parseInt(lines[0]);
		int M = Integer.parseInt(lines[1]);
		int[][] ks = new int[M][N];


		for (int i = 0; i < M; i++) {
			int k = sc.nextInt();
			for(int j = 0;  j < k; j++) {
				ks[i][sc.nextInt() - 1] = 1;
			}
		}

		int[] p = new int[M];
		for(int i = 0 ; i < p.length; i++) {
			p[i] = sc.nextInt();
		}

		int sum = 0;
		//Shift演算を使っているらしい
		for(int i = 0; i < (1 << N); i++) {
			boolean exist = true;
			for(int j2 = 0; j2 < ks.length; j2++) {
				int count = 0;
				for(int k = 0; k < ks[j2].length; k++) {
					if(ks[j2][k] == 1) {
						if((1 & i >> k) == 1) {
							count++;
						}
					}
				}
				if(count % 2 != p[j2] ) {
					exist = false;
					break;
				}
			}
			if(exist) {
				sum++;
			}

		}

		System.out.println(sum);
	}

}
