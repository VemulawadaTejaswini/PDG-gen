import java.io.*;
import java.util.*;

public class Main {
	
	static int discTime = 0;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[][] v = new int[n+1][n];
		int[] d = new int[n+1];
		int[] f = new int[n+1];
		
		for (int i = 0; i < n; i++) {
			int u = sc.nextInt();
			int k = sc.nextInt();
			for (int a = 0; a < k; a++) {
				v[u][a] = sc.nextInt();
			}
		}
		
		for (int i = 1; i <= n; i++) {
			if (d[i] == 0) {
				dfs(v,d,f,i);
			}
		}
		
		for (int i = 1; i <= n; i++) {
			System.out.println(i + " " + d[i] + " " + f[i]);
		}
		
	}
	
	static void dfs(int[][] v, int[] d, int[] f, int u){
		d[u] = ++discTime;
		for (int i = 0; i < v[u].length && v[u][i]>0; i++) {
			if (d[v[u][i]] == 0) {
				dfs(v, d, f, v[u][i]);
			}
		}
		f[u] = ++discTime;
	}
	
	
	
}
