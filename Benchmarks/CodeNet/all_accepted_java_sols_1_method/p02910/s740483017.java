import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		String s = sc.next();
		
		// 計算
		String result = "Yes";
		for(int i = 0; i < s.length(); i++){
		    if(i%2 == 0){
		        if(s.charAt(i) == 'L') result = "No";
		    }else{
		        if(s.charAt(i) == 'R') result = "No";
		    }
		}
		// 出力
		System.out.println(result);
		
	}
}
