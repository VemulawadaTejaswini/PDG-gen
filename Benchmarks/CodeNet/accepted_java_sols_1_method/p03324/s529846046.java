import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int d = sc.nextInt();
		int n = sc.nextInt();
		
		// 計算
		int result = 0;
		result = (int)pow(100, d) * n;
		if(n == 100) result += (int)pow(100, d);
		
		// 出力
		System.out.println(result);
	}
}
