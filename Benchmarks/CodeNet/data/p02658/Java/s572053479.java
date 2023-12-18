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
		int zen = N/2;
		//System.out.println(zen);
		long ans1 = 1;
		long ans2 = 1;
		long ans = 1;
		if(N==2) {
			ans = A[0]*A[1];
			if(ans>(long)Math.pow(10, 18)) {
				System.out.println(-1);
				System.exit(0);
			}
			System.out.println(ans);
		}
		if(N!=2) {
		for(int j=0;j<zen;j++) {
			ans1 *= A[j];
			//System.out.println(ans1+"aha");
			if(ans1>(long)Math.pow(10, 18)) {
				System.out.println(-1);
				System.exit(0);
			}
		}
//		int kou=0;
//		if(N%2==0) {
//			
//		}
		
		for(int k=(N/2);k<N;k++) {
			ans2 *= A[k];
			//System.out.println(ans2);
			if(ans2>(long)Math.pow(10, 18)) {
				System.out.println(-1);
				System.exit(0);
			}
		}
		
		
		
		
//		if(ans>(long)Math.pow(10, 18)) {
//			System.out.println(-1);
//			System.exit(0);
//		}
		if(ans1*ans2>(long)Math.pow(10, 18)) {
			System.out.println(-1);
			System.exit(0);
		}
		System.out.println(ans1*ans2);
		}
		//System.out.println((long)Math.pow(10, 18));
	}
}