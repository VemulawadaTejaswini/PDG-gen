import java.io.*;

public class Main {
    public static final int INF = -100000 * 5000 - 1;
    
    public static void main(String[] args) throws IOException {
	BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in));
	
	int n = Integer.parseInt(br.readLine());
	while (n != 0) {
	    if (n == 0) break;
	    int[] a = new int[n];
	    for (int i = 0; i < n; i++) {
		a[i] = Integer.parseInt(br.readLine());
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
		for (int j = i; j < n; j++) {
		    ans = Math.max(ans, sum[i][j]);
		}
	    }
	    System.out.println(ans);
	    
	    n = Integer.parseInt(br.readLine());
	}
    }
}