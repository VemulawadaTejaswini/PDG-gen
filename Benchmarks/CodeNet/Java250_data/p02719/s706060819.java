//package atcoder;
 
import java.util.*;
 
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long K = sc.nextLong();
		long ans = N % K;
		
		/*if(ans==N) {
			System.out.println(N);
		}*/
		while(ans>Math.abs(ans-K)) {
			ans = Math.abs(ans-K);
		}
		
		
		System.out.println(ans);
	}
}
