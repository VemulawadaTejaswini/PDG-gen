import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
	public static void main(String[] aegs) throws IOException{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int K = sc.nextInt();

		long[] A = new long[N+1];
		long[] B = new long[M+1];
		
		A[0]= 0 ;
		B[0]= 0 ;
		
		for(int i=1;i<N+1;i++)A[i]=sc.nextLong()+A[i-1];
		for(int i=1;i<M+1;i++)B[i]=sc.nextLong()+B[i-1];
		
		int best = M;
		int count = 0;
		
		for(int i=0;i<N+1;i++) {
			if(A[i]>K) break;
			for(int j=M;j>0;j--) {
				if(B[j]<=K-A[i]) {
					best=j;
					break;
				}
			}
			count=Math.max(count,i+best);
		}
		System.out.println(count);
		
	}
}