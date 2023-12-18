import java.util.*;

import java.lang.*;

import java.math.*;



public class Main {

	Scanner sc = new Scanner(System.in);



	int bitC(int a) {

		if (a == 0)

			return 0;

		return bitC(a >> 1) + (a & 1);

	}



	void run() {

		int[][] dp = new int[300][10];

		dp[0][0] = 1;

		for(int i=1;i<10;i++){

			for(int j =0 ; j <10;j++){

				for(int k = 0; k+i*j < 300;k++){

					dp[k+i*j][i] += dp[k][i-1];

				}

			}

		}

		for (; sc.hasNextInt();) {

			int n = sc.nextInt();

			int s = sc.nextInt();

			if (n > 10 || s > 300) {

				System.out.println("0");

				continue;

			}

			System.out.println(dp[s][n]);

		}

	}



	public static void main(String[] args) {

		Main m = new Main();

		m.run();

	}

}