import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		String s = sc.next();
		
		// 計算
		String result = "";
		
		String first = s.substring(0, 2);
		String last = s.substring(2, 4);
		int f = Integer.parseInt(first);
		int l = Integer.parseInt(last);
		
		if(1 <= f && f <= 12){
		    if(1 <= l && l <= 12){
		        result = "AMBIGUOUS";
		    }else{
		        result = "MMYY";
		    }
		}else{
		    if(1 <= l && l <= 12){
		        result = "YYMM";
		    }else{
		        result = "NA";
		    }
		}
		
		// 出力
		System.out.println(result);
	}
}