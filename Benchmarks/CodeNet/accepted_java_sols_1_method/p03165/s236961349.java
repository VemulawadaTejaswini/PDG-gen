import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		String s = sc.next();
		String t = sc.next();
		
		// 計算
		String result = "";
		int[][] dp = new int[s.length()+1][t.length()+1];
		for(int i = 1; i <= s.length(); i++){
		    for(int j = 1; j <= t.length(); j++){
		        if(s.charAt(i-1) == t.charAt(j-1)){
		            dp[i][j] = dp[i-1][j-1] + 1;
		        }else{
		            dp[i][j] = max(dp[i-1][j], dp[i][j-1]);
		        }
		    }
		}
		int len = dp[s.length()][t.length()];
		char[] a = new char[len];
		int i = s.length();
		int j = t.length();
		while(len > 0){
		    if(s.charAt(i-1) == t.charAt(j-1)){
		        a[len-1] = s.charAt(i-1);
		        i--;
		        j--;
		        len--;
		    }else if(dp[i][j] == dp[i-1][j]){
		        i--;
		    }else{
		        j--;
		    }
		}
		result = String.valueOf(a);
		
		// 出力
		System.out.println(result);
	}
}
