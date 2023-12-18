//package atcoder;
 
import java.util.*;
//import java.math.BigDecimal;
 
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[] = new int [N];
		for(int i=0;i<N;i++) {
			A[i] = sc.nextInt();
		}
		
	boolean ok[] = new boolean[N];
	Arrays.fill(ok, false);
		int count=0;
		for(int j=0;j<N;j++) {
			for(int k=0;k<N;k++) {
				if(j==k) {
					continue;
				}
				if(A[j]%A[k]==0) {
					//ok = true;
					//System.out.println(j);
					//count++;
					//break;
					ok[j] = true;
				}
			}
		}
		//System.out.println(count);
		for(int j=0;j<N;j++) {
			if(!ok[j]) {
				count++;
			}
		}
		System.out.println(count);
		
	}
}