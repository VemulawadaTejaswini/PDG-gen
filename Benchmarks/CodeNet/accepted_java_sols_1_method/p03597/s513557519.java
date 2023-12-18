import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		int a = sc.nextInt();
		
		// 計算
		int result = 0;
		result = n * n - a;
		
		// 出力
		System.out.println(result);
	}
}
