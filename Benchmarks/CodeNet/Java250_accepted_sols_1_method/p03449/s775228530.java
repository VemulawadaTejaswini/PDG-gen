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
		int max = 0;
		for(int i=0;i<n;i++) {
			int total = 0;
			for(int j=0;j<=i;j++) {
				total += a[0][j];
			}
			for(int j=i;j<n;j++) {
				total += a[1][j];
			}
			if(total>max) max = total;
		}
		System.out.println(max);
		in.close();
	}

}
