//package atcoder;
 
import java.util.*;
import java.math.BigDecimal;
 
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		int K = sc.nextInt();
		int ans=0;
		
		while(N>0) {
			N = N/K;
			ans ++;
		}
		System.out.println(ans);
	}
}