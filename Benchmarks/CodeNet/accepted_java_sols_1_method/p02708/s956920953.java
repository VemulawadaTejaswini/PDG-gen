import java.util.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		// 計算
		long result = 0;
		long MOD = 1000000007L;
		for(long i = k; i <= n+1; i++){
		    result += i*(2*n+1-i)/2 - (i-1)*i/2 + 1;
		    result %= MOD;
		}
		
		// 出力
		System.out.println(result);
	}
}
