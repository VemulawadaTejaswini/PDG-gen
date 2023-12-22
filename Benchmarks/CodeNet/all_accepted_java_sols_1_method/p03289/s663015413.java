import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		String s = sc.next();
		
		// 計算
		String result = "AC";
		if(s.charAt(0) != 'A') result = "WA";
		boolean flg = false;
		for(int i = 1; i < s.length(); i++){
		    if(Character.isUpperCase(s.charAt(i))){
		        if(i >= 2 && s.length()-2 >= i && s.charAt(i) == 'C' && !flg){
		            flg = true;
		        }else{
		            result = "WA";
		        }
		    }
		}
		if(!flg) result = "WA";
		
		// 出力
		System.out.println(result);
	}
}
