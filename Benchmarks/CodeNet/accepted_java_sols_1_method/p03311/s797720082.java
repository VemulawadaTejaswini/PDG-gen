import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		long[] A = new long[N+1];
		long[] dis = new long[N+1];
		long cc = 0,dd = 0;
		for( int i=1; i<=N; i++ ){
			cc++;
			A[i] = sc.nextLong();
			dis[i] = A[i]-cc;
		}
		Arrays.sort(dis);
		long ans1 = 0,ans2 = 0;
		long b1 = dis[N/2],b2 = dis[N/2+1];			
			for( int i=1; i<=N; i++ ){
				dd++;
				ans1 += Math.abs( A[i]-(b1+dd) );
				ans2 += Math.abs( A[i]-(b2+dd) );
			}						
		System.out.println(Math.min(ans1,ans2));
	}
}
