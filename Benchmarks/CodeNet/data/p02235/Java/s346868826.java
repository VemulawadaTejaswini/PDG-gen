import java.util.*;
import java.io.*;

class Main {

	static int[][] dp;
	static String x;
	static String y;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		for (int ds=0; ds<n; ds++) {
			x = br.readLine();
			y = br.readLine();

			int xLen = x.length();
			int yLen = y.length();
			dp = new int[xLen+1][yLen+1];

			System.out.println(rec(xLen,yLen));
		}


		br.close();
	}

	static int rec(int i,int j){
		if (dp[i][j] != 0)
			return dp[i][j];
		if (i==0 || j==0)
			return 0;
		if (x.charAt(i-1) == y.charAt(j-1))
			return dp[i][j] = rec(i-1,j-1)+1;
		else
			return dp[i][j] = Math.max(rec(i-1,j),rec(i,j-1));
	}
}