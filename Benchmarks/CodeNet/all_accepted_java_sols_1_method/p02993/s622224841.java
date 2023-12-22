import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		String s = sc.next();
		
		// 計算
		String result = "Good";
		for(int i = 1; i < s.length(); i++){
		    if(s.charAt(i) == s.charAt(i-1)) result = "Bad";
		}

		// 出力
		System.out.println(result);
		
	}
}
