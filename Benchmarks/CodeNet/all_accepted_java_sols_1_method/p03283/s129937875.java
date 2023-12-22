

import java.util.Scanner;



public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int q = sc.nextInt();

		int[][] numOfTrains = new int[n][n];

		for (int i=0;i<m;i++) {
			int l = sc.nextInt()-1;
			int r = sc.nextInt()-1;

			numOfTrains[l][r]++;
		}

		int[][] numOfTrainsSum = new int [n][n];

		for (int i=0;i<n;i++) {
			for (int j=i;j>=0;j--) {
				if (j==i) {
					numOfTrainsSum[j][i]=numOfTrains[j][i];
				} else {
					numOfTrainsSum[j][i]=numOfTrainsSum[j+1][i]+numOfTrains[j][i];
				}
			}
		}

		int[][] ans = new int[n][n];

		for (int i=0;i<n;i++) {
			for (int j=i;j<n;j++) {
				if(j==i) {
					ans[i][j]=numOfTrainsSum[i][j];
				} else {
					ans[i][j]=ans[i][j-1]+numOfTrainsSum[i][j];
				}
			}
		}

		for (int i=0;i<q;i++) {
			int pp = sc.nextInt()-1;
			int qq = sc.nextInt()-1;
			System.out.println(ans[pp][qq]);
		}

	}




}


