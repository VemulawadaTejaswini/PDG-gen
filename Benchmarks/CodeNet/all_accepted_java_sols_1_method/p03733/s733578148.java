import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();	//人数
		long T = sc.nextLong();	//お湯出る時間
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
