import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		String s = sc.next();
		
		// 計算
		int result = 0;
		if(s.equals("SUN")){
		    result = 7;
		}else if(s.equals("MON")){
		    result = 6;
		}else if(s.equals("TUE")){
		    result = 5;
		}else if(s.equals("WED")){
		    result = 4;
		}else if(s.equals("THU")){
		    result = 3;
		}else if(s.equals("FRI")){
		    result = 2;
		}else if(s.equals("SAT")){
		    result = 1;
		}
		
		// 出力
		System.out.println(result);
	}
	
}
