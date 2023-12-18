package practice;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (true) {
			int n, m;
			n = scan.nextInt();
			m = scan.nextInt();
			int[] taro = new int[n];
			int[] hanako = new int[m];

			int tsum = 0;
			int hsum = 0;

			int[] ttoh = new int[100];
			int[] htot = new int[100];

			int flag = 0;
			int set = 0;

			int sum = 200;

			
			int tresult = 0;
			int hresult = 0;

			if (n == 0 && m == 0)
				break;

			for (int i = 0; i < n; i++) {
				taro[i] = scan.nextInt();
				tsum += taro[i];
			}

			for (int i = 0; i < m; i++) {
				hanako[i] = scan.nextInt();
				hsum += hanako[i];
			}
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					if ((tsum - taro[i] + hanako[j]) == (hsum - hanako[j] + taro[i])) {
						flag = 1;
						ttoh[set] = taro[i];
						htot[set] = hanako[j];
						set++;
					}
				}
			}

			if (flag == 1) {
				for (int i = 0; i < set; i++) {
					if (sum > ttoh[i] + htot[i]) {
						sum = ttoh[i] + htot[i];
						tresult = ttoh[i];
						hresult = htot[i];
					}
				}
			}

			if (flag == 0) {
				System.out.println(-1);
			} else {
				System.out.println(tresult + " " + hresult);
			}

		}
	}

}