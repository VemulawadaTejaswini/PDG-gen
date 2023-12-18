import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] A = new int[N];
		int[] B = new int[N];
		long[] plus = new long[N+1];
		long[] minus = new long[N+1];
		for( int i=0; i<N; i++ ){
			A[i] = sc.nextInt();
			B[i] = A[i];
		}
		Arrays.sort(B);
		long count = 1;
		long total = 0;      
		for( int i=1; i<N; i++ ){
			if( B[i]==B[i-1] ){
				count++;
			}
			if( B[i]!=B[i-1] || i==N-1 ){
				plus[B[i-1]] = count*(count-1)/2;
				if( count>1 ){
					total += plus[B[i-1]];
				}                
				minus[B[i-1]] = (count-1)*(count-2)/2;
				count = 1;
			}
		}        
		for( int i=0; i<N; i++ ){
			System.out.println( total - plus[A[i]] + minus[A[i]] );
		}    
	}
}
