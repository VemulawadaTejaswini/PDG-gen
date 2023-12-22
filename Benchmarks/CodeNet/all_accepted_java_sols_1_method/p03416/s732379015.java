import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		// 計算
		int result = 0;
		for(int i = a; i < b+1; i++){
		    String s = String.valueOf(i);
		    boolean chk = true;
		    for(int j = 0; j < s.length()/2; j++){
		        if(s.charAt(j) != s.charAt(s.length() - j - 1)){
		            chk = false;
		            break;
		        }
		    }
		    if(chk) result++;
		}
		
		// 出力
		System.out.println(result);
	}
}


