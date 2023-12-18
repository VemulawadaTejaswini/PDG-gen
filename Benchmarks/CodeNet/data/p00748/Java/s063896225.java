import java.util.*;

import java.lang.*;

import java.math.*;



public class Main {

	Scanner sc = new Scanner(System.in);



	void run() {

		int[] fd = new int[180];

		int[] fd2 = new int[180];

		int k=0;

		for (int i = 1, j = 0; i * (i + 1) * (i + 2) / 6 < 1000000; i++, j++) {

			fd[j] = i * (i + 1) * (i + 2) / 6;

			if ((fd[j] & 1) == 1) {

				fd2[k] = fd[j];

				k++;

			}

		}

		fd2 = Arrays.copyOfRange(fd2,0 , k);

		

		int dp[] = new int[1000000];

		int dp2[] = new int[1000000];

		Arrays.fill(dp, Integer.MAX_VALUE);

		Arrays.fill(dp2, Integer.MAX_VALUE);

		dp[0] = dp2[0] = 0;

		System.out.println(Arrays.toString(fd));

		System.out.println(Arrays.toString(fd2));

		for (int i = 0; i < 1000000; i++) {

			if (dp[i] == Integer.MAX_VALUE)

				continue;

			for (int j = 0; j < fd.length; j++) {

				if (i + fd[j] >= 1000000)

					break;

				dp[i + fd[j]] = Math.min(dp[i] + 1, dp[i + fd[j]]);

			}

		}

		for (int i = 0; i < 1000000; i++) {

			if (dp2[i] == Integer.MAX_VALUE)

				continue;

			for (int j = 0; j < fd2.length; j++) {

				if (i + fd2[j] >= 1000000)

					break;

				dp2[i + fd2[j]] = Math.min(dp2[i] + 1, dp2[i + fd2[j]]);

			}

		}



		for (;;) {

			int n = sc.nextInt();

			if (n == 0)

				break;

			System.out.println(dp[n] + " " + dp2[n]);

		}

	}



	public static void main(String[] args) {

		Main m = new Main();

		m.run();

	}

}