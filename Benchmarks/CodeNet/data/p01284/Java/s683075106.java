import java.util.*;

import java.lang.*;

import java.math.*;



public class Main {

	Scanner sc = new Scanner(System.in);



	class dm implements Comparable<dm> {

		int d;

		int m;



		dm(int d, int m) {

			this.d = d;

			this.m = m;

		}



		public int compareTo(dm tar) {

			if (d == tar.d)

				return m - tar.m;

			return d - tar.d;

		}

	}



	void run() {

		for (;;) {

			int t = sc.nextInt();

			int r[] = new int[t];



			if (t == 0) {

				break;

			}

			for (int i = 0; i < t; i++) {

				r[i] = sc.nextInt();

			}



			int n = sc.nextInt();

			int d[] = new int[n];

			int m[] = new int[n];

			dm[] data = new dm[n];

			for (int i = 0; i < n; i++) {

				data[i] = new dm(sc.nextInt(), sc.nextInt());

			}



			Arrays.sort(data);



			int[][] dp = new int[n + 1][t];

			for(int i = 0; i < n+1 ; i++){

			Arrays.fill(dp[i], Integer.MAX_VALUE >> 4);

			}

			dp[0][0] = 0;



			int dd[] = new int[n];

			dd[0] = 0;

			for (int i = 1; i < n; i++) {

				dd[i] = data[i].d - data[i - 1].d;

			}



			for (int i = 0; i < n; i++) {

	//			System.out.println(Arrays.toString(dp[i+1]));

				for (int z = 0; z < t; z++) {

					dp[i + 1][0] = Math.min(dp[i][z] + 1, dp[i + 1][0]);

				}

				for (int z = 0; z < dd[i]; z++) {

					if (data[i].m >= r[z]) {

						dp[i + 1][z] = Math.min(dp[i + 1][z], dp[i + 1][0]);

					}

				}

	//			System.out.println(Arrays.toString(dp[i+1]));



				for (int z = 0; z < t; z++) {

					int trr = z + dd[i];

					trr %= t;

					if (data[i].m >= r[trr]) {

						dp[i + 1][trr] = Math.min(dp[i + 1][trr], dp[i][z]);

					}

				}

			}

			for(int i =0 ; i < n+1;i++){

//				System.out.println(Arrays.toString(dp[i]));

			}

			int ans = 10000;

			for (int i = 0; i < t; i++) {

				ans = Math.min(ans, dp[n][i]);

			}

			System.out.println(ans);

		}



	}



	public static void main(String[] args) {

		Main m = new Main();

		m.run();

	}

}