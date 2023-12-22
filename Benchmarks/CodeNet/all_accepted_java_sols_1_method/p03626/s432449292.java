import java.util.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		String s1 = sc.next();
		String s2 = sc.next();
		
		// 計算
		long result = 0L;
		long MOD = 1000000007L;
		boolean flg = false;
		for(int i = 0; i < n; i++){
		    if(s1.charAt(i) == s2.charAt(i)){
		        if(i == 0){
		            result = 3;
		        }else if(flg){
		            result *= 2;
		            result %= MOD;
		        }
		        flg = true;
		    }else{
		        if(i == 0){
		            result = 6;
		        }else if(flg){
		            result *= 2;
		            result %= MOD;
		        }else{
		            result *= 3;
		            result %= MOD;
		        }
		        i++;
		        flg = false;
		    }
		}
		
		// 出力
		System.out.println(result);
	}
}


