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
		String result = "bust";
		if(a + b + c < 22) result = "win";
		
		// 出力
		System.out.println(result);
	}
}
