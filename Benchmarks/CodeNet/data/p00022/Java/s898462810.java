import java.util.Scanner;

public class Main {
    public static final int INF = -100000 * 5000 - 1;
    public static void main(String[] args) {
	while (true) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    if (n == 0) break;
	    int[] a = new int[n];
	    for (int i = 0; i < n; i++) {
		a[i] = sc.nextInt();
	    }
	    
	    int[][] sum = new int[n][n];
	    for (int i = 0; i < n; i++) {
		sum[i][i] = a[i];
	    }
	    for (int i = 0; i < n; i++) {
		for (int j = i; j + 1 < n; j++) {
		    sum[i][j + 1] = sum[i][j] + a[j + 1];
		}
	    }
	    
	    int ans = INF;
	    for (int i = 0; i < n; i++) {
		for (int j = 0; j < n; j++) {
		    ans = Math.max(ans, sum[i][j]);
		}
	    }
	    System.out.println(ans);
	}
    }
}