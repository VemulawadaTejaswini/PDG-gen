

import java.util.Scanner;

public class Main {

	static int n;
	static int money;
	static int sub[];
	static int total;
	static int dfs[][] = new int[1000][1000];
	static int k = 0;
	public static void main(String[] args) {

		Scanner sr = new Scanner(System.in);
		n = sr.nextInt();
		money = sr.nextInt();
		sub = new int[n];

		for (int i = 0; i < n; i++) {

			sub[i] = sr.nextInt();
		}
		int max = 0;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				dfs[i][j] += sub[j];
				if(max < dfs[i][j] && max < money) max = dfs[i][j];
			}
		}
		System.out.println(max);

	}


}

