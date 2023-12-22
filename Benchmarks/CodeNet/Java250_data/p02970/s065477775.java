import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		// 入力
		double n = sc.nextInt();
		double d = sc.nextInt();
		
		// 計算
		int result = (int)ceil(n/(2*d + 1));
		
		// 出力
		System.out.println(result);
	}

}
