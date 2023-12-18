import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		long[] A = new long[N];
		long ans = 1;
		long LL = 1000000000000000000L;
		for( int i=0; i<N; i++ ){
			A[i] = sc.nextLong();
		}
		Arrays.sort(A);
		for( int i=0; i<N; i++ ){
			if( A[i]==0 || ans==0 ){
				System.out.println(0);
				break;
			}else if( ans>LL/A[i] ){
				System.out.println(-1);
				break;
			}else{
				ans = ans * A[i];
			}
			if( i==N-1 ){
				System.out.println(ans);
			}
		}
	}
}