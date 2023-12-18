import java.util.*;
import java.io.*;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Main {
	static int[][] dp;
	static int[] p;

	public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.nextLine());

    dp = new int[n+1][n+1];
    p = new int[n+1];

    for (int i = 0; i < n; i++) {
      int[] input = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      p[i] = input[0];
      p[i+1] = input[1];
    }

    out.println(count(1,n));
	}

	static int count(int i,int j) {
		if (dp[i][j] != 0 || i==j) return dp[i][j];
    if (i-j == 1) return dp[i][j] = p[i-1] * p[i] * p[j];

		int min = Integer.MAX_VALUE;
		for (int k=i; k<j; k++){
			min = min(min, count(i,k) + count(k+1,j) + p[i-1] * p[k] * p[j]);
    }

		return dp[i][j] = min;
	}
}
