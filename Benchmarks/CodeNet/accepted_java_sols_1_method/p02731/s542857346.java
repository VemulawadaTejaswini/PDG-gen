import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
    
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		double L = sc.nextDouble();
		
		// 計算
		double result = 0;
		result = L*L*L/27;
		
		// 出力
		//System.out.println(result);
		System.out.println(String.format("%.16f", result));
		
	}
}
