import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.*;

class Main {
    
    public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	int q = Integer.parseInt(br.readLine());
	for (int i = 0; i < q; i++) {
	    String X = br.readLine();
	    String Y = br.readLine();
	    
	    int[][] dp = new int[X.length() + 1][Y.length() + 1];
	    int lc = 0;
	    for (int j = 1; j <= X.length(); j++) {
		for (int k = 1; k <= Y.length(); k++) {
		    char x = X.charAt(j - 1);
		    char y = Y.charAt(k - 1);
		    if (x == y) {
			lc = dp[j][k] = dp[j - 1][k - 1] + 1;
		    } else {
			lc = dp[j][k] = Math.max(dp[j][k - 1], dp[j - 1][k]);
		    }
		}
	    }
	    System.out.println(lc);
	}
    }
}

