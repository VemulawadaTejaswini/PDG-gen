import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long x = sc.nextInt();
		int[][] arr = new int[n][n];
		long[] totals = new long[n];
		for (int i = 0; i < n; i++) {
		    arr[0][i] = sc.nextInt();
		    totals[0] += arr[0][i];
		}
		for (int i = 1; i < n; i++) {
		    for (int j = 0; j < n; j++) {
		        arr[i][j] = Math.min(arr[i - 1][j], arr[i - 1][(j - 1 + n) % n]);
		        totals[i] += arr[i][j];
		    }
		    totals[i] += x * i;
		}
		Arrays.sort(totals);
		System.out.println(totals[0]);
   }
}


