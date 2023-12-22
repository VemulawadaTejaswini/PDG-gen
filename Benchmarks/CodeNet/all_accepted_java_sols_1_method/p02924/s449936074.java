import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		// 入力
		long n = sc.nextLong();

        long result = n * (n - 1) / 2; 
		// 計算

		// 出力
		System.out.println(result);
	}

}
