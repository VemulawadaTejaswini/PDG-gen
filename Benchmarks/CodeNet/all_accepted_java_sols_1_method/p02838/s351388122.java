import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		long[] a = new long[n];
		int MOD = 1000000007;
		for(int i = 0; i < n; i++){
		    a[i] = sc.nextLong();
		}
		
		// 計算
		long result = 0;
		long[] bit = new long[60];
		for(int i = 0; i < n; i++){
		    String s = Long.toString(a[i], 2);
		    for(int j = 0; j < s.length(); j++){
		        if(s.charAt(s.length()-1-j) == '1') bit[j]++;
		    }
		}
		for(int i = 0; i < bit.length; i++){
		    //result += (((1L<<i)%MOD)*((bit[i])*(n-bit[i]))%MOD)%MOD;
		    result += (1L<<i)%MOD * bit[i]%MOD * (n-bit[i])%MOD;
		    result %= MOD;
		}
		
		// 出力
		System.out.println(result);
	}
}
