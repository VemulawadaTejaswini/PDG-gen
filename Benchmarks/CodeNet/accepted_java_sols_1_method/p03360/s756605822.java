import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int k = sc.nextInt();

		// 計算
		int result = 0;
		int max = max(a, max(b, c));
		result = a + b + c + (int)(max*(pow(2, k) -1));
		

		// 出力
		System.out.println(result);
	}
}
