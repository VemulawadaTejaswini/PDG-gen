import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int r, c, i, j, sum1;
		r = stdIn.nextInt();
		c = stdIn.nextInt();
		int[][] a = new int[r][c];
		int[] sum = new int[c];
		for (i = 0; i < r; i++) {
			for (j = 0; j < c; j++) {
				a[i][j] = stdIn.nextInt();
				sum[j] += a[i][j];
			}
		}
		for (i = 0; i < r; i++) {
			sum1 = 0;
			for (j = 0; j < c; j++) {
				System.out.print(a[i][j] + " ");
				sum1 += a[i][j];
			}
			System.out.println(sum1);
		}
		sum1=0;
		for (j = 0; j < c; j++) {
			System.out.print(sum[j] + " ");
			sum1 += sum[j];
			if(j==c-1){
				System.out.println(sum1);
			}
		}
		stdIn.close();
	}
}

