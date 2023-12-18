import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		String s = sc.next();
		String t = sc.next();
		
		// 計算
		String result = "YES";
		if(s.charAt(0) != t.charAt(2)) result = "NO";
		if(s.charAt(1) != t.charAt(1)) result = "NO";
		if(s.charAt(2) != t.charAt(0)) result = "NO";
		
		// 出力
		System.out.println(result);
	}
}

