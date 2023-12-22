import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		long x = sc.nextLong();
		long[] a = new long[N];
		long[] ans = new long[N-1];
		for( int i=0; i<N; i++ ){
			a[i]=sc.nextLong();
		}
		long b = 0;
		for( int i=0; i<N-1; i++ ){
			ans[i] = a[i]+a[i+1]-x;
			if( ans[i]>0 ){
				a[i+1] = a[i+1] - ans[i];
				if( a[i+1]<0 ){
					a[i]+=a[i+1];
					a[i+1] = 0;
				}
				b+=ans[i];              
			}
		}
		System.out.println(b);
	}
}
