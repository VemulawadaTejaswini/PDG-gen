import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		long[] a = new long[N];
		long[] ans = new long[N-1];
		long total = 0,dis = 0;
		for( int i=0; i<N; i++ ){
			a[i] = sc.nextLong();
			total += a[i];
		}
		for( int i=0; i<N-1; i++ ){
			dis += a[i];
			total -= a[i];          
			ans[i] = Math.abs(total-dis);        
		}
		Arrays.sort(ans);
		System.out.println(ans[0]);
	}
}
