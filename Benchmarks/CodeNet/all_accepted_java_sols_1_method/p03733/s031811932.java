import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();	
		long T = sc.nextLong();	
		long[] t = new long[N];
		for( int i=0; i<N; i++ ){
			t[i] = sc.nextLong();
		}
		long ans = 0;
		for( int i=1; i<N; i++ ){
			if( t[i]-t[i-1]<=T ){
				ans+=t[i]-t[i-1];
			}else{
				ans+=T;
			}
		}
		System.out.println(ans+T);
	}
}
