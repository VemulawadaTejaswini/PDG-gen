//package atcoder;
 
import java.util.*;
//import java.math.BigDecimal;
 
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Long A[] = new Long[N];
		for(int i=0;i<N;i++) {
			A[i] = sc.nextLong();
		}
		Long ans = (long) 1;
		for(int i= 0;i<N;i++) {
			ans *= A[i];
			if(ans>(long)Math.pow(10, 18)) {
				System.out.println(-1);
				System.exit(0);
			}
		}
		System.out.println(ans);
	}
}
	