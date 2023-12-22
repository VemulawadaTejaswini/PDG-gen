import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		String s = sc.next();
		long k = sc.nextLong();
		
		// 計算
		int result = 1;
		for(int i = 0; i < s.length(); i++){
		    int m = s.charAt(i) - '0';
		    if(m != 1){
		        result = m;
		        break;
		    }
		    k--;
		    if(k == 0) break;
		}
		
		// 出力
		System.out.println(result);
	}
}
