import java.io.PrintWriter;
import java.util.Scanner;

public class Main{
	static final int MOD = 1000000007;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);

		//入力
		long n = sc.nextLong();
		sc.close();

		//処理
		int ans = 10;
		for(long i = 1; i * i <= n; i++){
			if(n % i == 0){
				long j = n / i;
				long greater = Math.max(i,j);
				int temp = 0;
				while(greater != 0){
					temp++;
					greater /= 10;
				}
				ans = Math.min(ans, temp);
			}
		}

		//出力	
		out.println(ans);
		out.flush();
	}
}