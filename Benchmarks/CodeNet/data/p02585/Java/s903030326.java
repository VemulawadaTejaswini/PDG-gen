import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[][] nexts = new int[18][n];
		for (int i = 0; i < n; i++) {
		    nexts[0][i] = sc.nextInt() - 1;
		}
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
		    arr[i] = sc.nextInt();
		}
		long max = Long.MIN_VALUE;
		for (int i = 0; i < n; i++) {
		    long value = 0;
		    int idx = nexts[0][i];
		    for (int j = 0; j < Math.min(n, k); j++) {
		        value += arr[idx];
		        max = Math.max(max, value);
		        idx = nexts[0][idx];
		    }
		}
		long[][] matrix = new long[18][n];
		for (int i = 0; i < n; i++) {
		    matrix[0][i] = arr[i];
		}
		for (int i = 1; i < 18; i++) {
		    for (int j = 0; j < n; j++) {
		        nexts[i][j] = nexts[i - 1][nexts[i - 1][j]];
		        matrix[i][j] = matrix[i - 1][j] + matrix[i - 1][nexts[i - 1][j]];
		    }
		}
		for (int i = 0; i < n; i++) {
		    int x = k;
		    int idx = i;
		    long vv = 0;
		    for (int j = 17; j >= 0; j--) {
		        if (x >= (1 << j)) {
		            vv += matrix[j][idx];
		            idx = nexts[j][idx];
		            x -= (1 << j);
		        }
		    }
		    max = Math.max(max, vv);
		}
		System.out.println(max);
	}
}
