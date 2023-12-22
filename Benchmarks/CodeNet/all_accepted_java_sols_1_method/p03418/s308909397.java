import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		long n = sc.nextLong();
		long k = sc.nextLong();
		
		// 計算
		long result = 0;
		for(long b = 1; b <= n; b++){
		    long p = n/b;
		    long r = n%b;
		    result += max(b-k, 0)*p + max(r-k+1, 0);
			if(k == 0) result--;
		}
		
		// 出力
		System.out.println(result);
	}
}


