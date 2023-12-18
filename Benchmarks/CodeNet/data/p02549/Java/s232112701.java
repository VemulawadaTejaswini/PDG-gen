import java.util.*;
import java.io.*;
import java.math.*;
public class Main {
    public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		PrintWriter ou = new PrintWriter(System.out);
		int n = Integer.parseInt(sc.next());
		int k = Integer.parseInt(sc.next());
		int[][] l = new int[2][n];
		int yono = 0;
		for(int i = 0 ; i < k ; i++){
			for(int j = 0 ; j < 2 ; j++) l[j][i] = Integer.parseInt(sc.next());
			yono += l[1][i] - l[0][i] + 1;
		}
		sc.close();
		int[] q = new int[yono];
		int cou = 0;
		for(int i = 0 ; i < k ; i++){
			for(int j = l[0][i] ; j <= l[1][i] ; j++){
				q[cou] = j;
				cou++;
			}
		}
		int[] dp = new int[n];
		Arrays.fill(dp , 0);
		dp[0] = 1;
		for(int i = 0 ; i < n ; i++){
			for(int j = 0 ; j < yono ; j++){
				if(q[j] + i < n){
					dp[i + q[j]] += dp[i];
					dp[i + q[j]] %= 998244353;
				}
			}
		}
		ou.println(dp[n - 1] % 998244353);
		ou.flush();
	}
}