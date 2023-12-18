import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		
		// 計算
		int result = (int)floor(n/1.08);
		int a = result;
		int b = result + 1;
		int c = (int)floor(a * 1.08);
		int d = (int)floor(b * 1.08);
		if(c == n){
		    result = a;
		}else if(d == n){
		    result = b;
		}else{
		    System.out.println(":(");
		    return;
		}
		
		// 出力
		System.out.println(result);
	}
}
