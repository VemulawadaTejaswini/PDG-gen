//package atcoder;
 
import java.util.*;
//import java.math.BigDecimal;
 
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N  =sc.nextInt();
		int P[] = new int[N];
		for(int i=0;i<N;i++) {
			P[i] = sc.nextInt();
		}
		int ok = Integer.MAX_VALUE;
		int count = 0;
		for(int j=0;j<N;j++) {
			ok = Math.min(ok,P[j]);
			if(ok==P[j]) {
				count ++;
			}
		}
		System.out.println(count);

			
	}
}