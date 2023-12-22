import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
    
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		String s = sc.next();
		char[] chars = s.toCharArray();
		
		// 計算
		int result = 0;
		int cnt  = 0;
		for(int i = 0; i < s.length(); i++){
		    char c = s.charAt(i);
		    if(c == 'A' || c == 'T' || c == 'C' || c == 'G'){
		        cnt++;
		        continue;
		    }
		    result = max(result, cnt);
		    cnt = 0;
		}
		result = max(result, cnt);

		// 出力
		System.out.println(result);
        
	}
}
