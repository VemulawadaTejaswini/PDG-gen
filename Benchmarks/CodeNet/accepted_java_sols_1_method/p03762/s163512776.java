import java.io.PrintWriter;
import java.util.Scanner;

public class Main{
	static final int MOD = 1000000007;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);

		//入力
		int n = sc.nextInt();
		int m = sc.nextInt();
		long[] x = new long[n];
		long[] y = new long[m];
		for(int i = 0; i < n; i++){
			x[i] = sc.nextLong();
		}
		for(int i = 0; i < m; i++){
			y[i] = sc.nextLong();
		}
		sc.close();

		//処理
		long tx = 0;
		long ty = 0;
		for(int i = 0; i < n; i++){
			tx += i * x[i] - (n - i - 1) * x[i];
			tx %= MOD;
		}
		for(int i = 0; i < m; i++){
			ty += i * y[i] - (m - i - 1) * y[i];
			ty %= MOD;
		}

		//出力	
		out.println((tx * ty) % MOD);
		out.flush();
	}
}