import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int r = sc.nextInt();
		
		// 計算
		String result = "ABC";
		if(r >= 1200) result = "ARC";
		if(r >= 2800) result = "AGC";
		
		// 出力
		System.out.println(result);
	}
}
