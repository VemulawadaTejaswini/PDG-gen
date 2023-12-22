import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	    String[] line = br.readLine().split(" ");
	    int n = Integer.parseInt(line[0]);
	    int m = Integer.parseInt(line[1]);
	    int l = Integer.parseInt(line[2]);

	    // parse A
	    long[][] a = new long[n][m];
	    for (int i = 0; i < n; i++) {
	    	line = br.readLine().split(" ");
	    	for (int j = 0; j < m; j++) {
		    	a[i][j] = Integer.parseInt(line[j]);
	    	}
	    }

	    // parse B
	    long[][] b = new long[m][l];
	    for (int i = 0; i < m; i++) {
	    	line = br.readLine().split(" ");
	    	for (int j = 0; j < l; j++) {
		    	b[i][j] = Integer.parseInt(line[j]);
	    	}
	    }

	    // Calculation
	    long[][] ans = new long[n][l];
	    for (int i = 0; i < n; i++) {
	    	for (int j = 0; j < l; j++) {
	    		for (int k = 0; k < m; k++) {
		    		ans[i][j] += (a[i][k] * b[k][j]);
	    		}
	    	}
	    }

	    // Display Answer
	    StringBuilder sb = new StringBuilder();
	    for (int i = 0; i < n; i++) {
	    	for (int j = 0; j < l; j++) {
	    		sb.append(ans[i][j]);
		    	if (j < l - 1) {
		    		sb.append(" ");
		    	}
	    	}
	    	sb.append("\n");
	    }
	    System.out.print(sb.toString());
	}
}