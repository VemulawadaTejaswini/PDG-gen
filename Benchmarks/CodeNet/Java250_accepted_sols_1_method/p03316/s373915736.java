import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		String s = sc.next();
		
		// 計算
		String result = "No";
		int n = 0;
		for(int i = 0; i < s.length(); i++){
		    n += s.charAt(i) - '0';
		}
		if(Integer.valueOf(s)%n == 0) result = "Yes";
		
		// 出力
		System.out.println(result);
	}
}
