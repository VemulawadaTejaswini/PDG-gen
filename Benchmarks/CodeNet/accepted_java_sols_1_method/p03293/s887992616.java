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
		String result = "No";
		for(int i = 0; i < s.length(); i++){
		    String now = s.substring(i, s.length()) + s.substring(0, i);
		    if(now.equals(t)) result = "Yes";
		}
		
		// 出力
		System.out.println(result);
	}
}
