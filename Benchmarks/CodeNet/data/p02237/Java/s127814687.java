

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[][] ar = new int[n][n];
		for (int i=0;i<n;i++) {
			int me = scan.nextInt();
			int nv = scan.nextInt();
			for (int j=0;j<nv;j++) {
				int to = scan.nextInt();
				ar[me-1][to-1]=1;
				//ar[to-1][me-1]=1;
			}
		}
		
		for (int i=0;i<n;i++) {
			StringBuilder sb = new StringBuilder();
			for (int j=0;j<n;j++) {
				sb.append(ar[i][j]).append(" ");
			}
			System.out.println(sb.substring(0, sb.length()-1));
		}
	}
}