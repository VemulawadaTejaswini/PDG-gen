import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
    
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		String s = sc.next();

		// 計算
		String result = "NO";
		int len = s.length();
		while(len >= 0){
		    if(len == 0){
		        result = "YES";
		        break;
		    }
    	    if(len >= 5 && "dream".equals(s.substring(len - 5, len))){len -= 5; continue;}
    	    if(len >= 5 && "erase".equals(s.substring(len - 5, len))){len -= 5; continue;}
    	    if(len >= 6 && "eraser".equals(s.substring(len - 6, len))){len -= 6; continue;}
    	    if(len >= 7 && "dreamer".equals(s.substring(len - 7, len))){len -= 7; continue;}
    	    len = -1;
		}
		
		// 出力
		System.out.println(result);
        
	}
}
