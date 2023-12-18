import java.util.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		long a = sc.nextLong();
		long b = sc.nextLong();
		long n = sc.nextLong();
		
		// 計算
		long result = 0;
		long x = min(b-1, n);
		result = a*x/b - a*(x/b);
		
		// 出力
		System.out.println(result);
	}
}

