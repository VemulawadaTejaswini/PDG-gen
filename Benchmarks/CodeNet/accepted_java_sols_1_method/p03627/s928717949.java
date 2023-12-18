import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		long[] A = new long[N+1];
		for( int i=1; i<=N; i++ ){
			A[i] = sc.nextLong();
		}
		Arrays.sort(A);
		int count = 1;
		long[] a = new long[2];
		int[] b = new int[2];
		int c = 0;
		for( int i=N; i>=2; i-- ){
			if( A[i]==A[i-1] ){
				count++;
			}
			if( A[i]==A[i-1] && A[i]!=A[i-2] ){
				a[c] = A[i];
				b[c] = count;
				count = 1;
				c++;
			}
			if( c==2 ){
				break;
			}
		}
		long ans = 0;      
		if( b[0]>=4 ){
			ans = a[0]*a[0];
		}else if( c==2 ){
			ans = a[0]*a[1];
		}else{
			ans = 0;
		}     
		System.out.println(ans);
	}
}
