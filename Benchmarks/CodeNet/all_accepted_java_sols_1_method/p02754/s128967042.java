import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		long n = sc.nextLong();
		long a = sc.nextLong();
		long b = sc.nextLong();
		
		// 計算
		long result = 0;
		result += (n/(a+b))*a;
		result += min(a, n%(a+b));
		
		// 出力
		System.out.println(result);
	}
}
