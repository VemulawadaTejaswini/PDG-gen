import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int[] a = new int[5000];
		int[][] sum = new int[5000][5000];
		int i, j, n, max;
		
		while (true) {
			for (i = 0; i < 5000; i++)
				for (j = 0; j < 5000; j++)
					sum[i][j] = 0;
			
			n = stdIn.nextInt();
			if (n == 0) break;
			
			for (i = 0; i < n; i++)
				a[i] = stdIn.nextInt();
			
			calcSum(a, sum, n);
			
			max = sum[0][0];
			for (i = 0; i < n; i++)
				for (j = i; j < n; j++)
					if (max < sum[i][j])
						max = sum[i][j];
			
			System.out.println(max);
		}
		
	}
	
	public static void calcSum(int[] a, int[][] sum, int n) {
		int i, j, k;
		for (i = 0; i < n; i++) 
			for (j = i; j < n; j++) 
				for (k = i; k <= j; k++)
					sum[i][j] += a[k];
	}
}