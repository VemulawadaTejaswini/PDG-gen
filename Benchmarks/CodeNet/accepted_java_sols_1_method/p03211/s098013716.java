import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		String s = sc.next();
		
		// 計算
	    int result = Integer.MAX_VALUE;
	    for(int i = 0; i < s.length() - 2; i++){
	        String now = s.substring(i, i + 3);
	        int n = Integer.valueOf(now);
	        result = min(result, abs(n - 753));
	    }

		// 出力
		System.out.println(result);
        
	}
}