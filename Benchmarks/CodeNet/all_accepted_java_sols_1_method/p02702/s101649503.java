import java.util.*;
import java.util.ArrayDeque;
import java.util.Queue;
import java.math.RoundingMode;
import java.math.BigDecimal;



public class Main{
	 public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	   	String s = sc.next();
	   	char[] s_c = s.toCharArray();
	   	int dp[] = new int[2019];
	   	dp[0] = 1;
	   	int rem = 0;
	   	int pow = 1;
	   	long ans = 0;
	   	for(int i = s_c.length-1; i >= 0; i--) {
	   		int x = Integer.parseInt(String.valueOf(s_c[i]));
	   		x = (x*pow)%2019;
	   		rem = (rem+x)%2019;
	   		ans += dp[rem];
	   		dp[rem]++;
	   		pow *= 10;
	   		pow%=2019;
	   	}
	   	System.out.println(ans);
	}
}