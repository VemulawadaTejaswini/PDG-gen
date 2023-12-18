import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[][] a = new int[2][n];
		for(int i=0;i<2;i++) {
			for(int j=0;j<n;j++) {
				a[i][j] = in.nextInt();
			}
		}
		int[][] sum = new int[2][n];
		sum[0][0] = a[0][0];
		sum[1][0] = a[1][0];
		for(int i=1;i<n;i++) {
			sum[0][i] = sum[0][i-1] + a[0][i];
			sum[1][i] = sum[1][i-1] + a[1][i];
		}
		int max = sum[0][0] + sum[1][n-1];
		for(int i=1;i<n;i++) {
			int total = sum[0][i] + sum[1][n-1] - sum[1][i-1];
			if(total>max) {
				max = total;
			}
		}
		System.out.println(max);
		in.close();
	}

}
