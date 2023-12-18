import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;
import java.util.Calendar.Builder;



public class Main {
	static int INF = 2 << 27;
	static int N;
	static int M;
	static int A;
	static int B;
	static int C;
	static int T;
	static long[][] dp;
	public static void main(String[] args) {	
		//FastScanner sc = new FastScanner();
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		while(true) {
			N = sc.nextInt();
			M = sc.nextInt();
			A = sc.nextInt();
			B = sc.nextInt();
			C = sc.nextInt();
			T = sc.nextInt();
			
			if(N == 0 && M == 0 && A == 0 && B == 0 && C == 0 && T == 0) break;
			long[] X = new long[N];
			for(int i = 0; i < N; i++) {
				X[i] = sc.nextLong();
			}
			
			long[][] matrix = new long[N][N];
			for(int i = 0; i < N; i++) {
				if(i - 1 >= 0) matrix[i][i - 1] = A;
				matrix[i][i] = B;
				if(i + 1 < N) matrix[i][i + 1] = C;
			}
			
			String TB = Integer.toBinaryString(T);
			long[][] mt = new long[N][N];
			for(int i = 0; i < N; i++) {
				mt[i][i] = 1;
			}
			for(int i = 0; i < TB.length(); i++) {
				if(TB.charAt(TB.length() - i - 1) == '1') {
					mt = mul(mt, matrix);
					mt = mod(mt);
				}
				matrix = mul(matrix,matrix);
				matrix = mod(matrix);
				
			}
			
			
			
			for(int i = 0; i < N; i++) {
				long ans = 0;
				for(int j = 0; j < N; j++) {
					ans = (mt[i][j] * X[j] + ans) % M;
				}
				if(i != 0) System.out.print(" " + ans);
				else System.out.print(ans);
			}
			System.out.println();
		}
	}
	static long[][] mul(long[][] a, long[][] b) {
		int n = a.length;
		long[][] ret = new long[n][n];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				for(int k = 0; k < n; k++) {
					ret[i][j] = (a[i][k] * b[k][j] + ret[i][j]);
				}
			}
		}
		return ret;
	}
	static long[][] mod(long[][] a) {
		long[][] ret = new long[a.length][a.length];
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				ret[i][j] = a[i][j] % M;
			}
		}
		return ret;
	}
	
	static long[][] add(long[][] a, long[][] b) {
		int n = a.length;
		long[][] ret = new long[n][n];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				ret[i][j] = (a[i][j] + b[i][j]);
			}
		}
		return ret;
	}

}