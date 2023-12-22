import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		long[] a = new long[N];
		long ans = 0;
		for( int i=0; i<N; i++ ){
			a[i] = sc.nextLong();
			long count = 0;
			for( int j=0; j<30; j++ ){
				if( a[i]%2!=0 ){
					a[i] = count;
					break;
				}else{
					a[i] = a[i]/2;                  
					count++;
				}
			}
			ans += a[i];
		}
		System.out.println(ans);
	}
}
