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
		
		// 計算
		int result = 0;
		if(a >= b && a >= c){
		    result = 10 * a + b + c;
		}else if(b >= a && b >= c){
		    result = 10 * b + a + c;
		}else{
		    result = 10 * c + a + b;
		}
		
		// 出力
		System.out.println(result);
		
	}
}
