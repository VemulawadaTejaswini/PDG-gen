import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		long K = sc.nextLong();
		long[] count = new long[100001];
		for( int i=0; i<N; i++ ){
			int a = sc.nextInt();
			long b = sc.nextLong();
			count[a] += b;
		}
		long ans = 0;
		for( int i=1; i<=100000; i++ ){
			ans += count[i];
			if( ans>=K ){
				System.out.println(i);
				break;
			}
		}
	}
}
