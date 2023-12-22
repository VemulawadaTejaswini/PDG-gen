import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		// 計算
		int result = 0;
		result = x + y/2;
		
		// 出力
		System.out.println(result);
	}
}

