import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		long x = sc.nextLong();
		long y = sc.nextLong();
		
		// 計算
		long result = 0;
		while(x <= y){
		    result++;
		    x *= 2;
		}
		
		// 出力
		System.out.println(result);
	}
}

