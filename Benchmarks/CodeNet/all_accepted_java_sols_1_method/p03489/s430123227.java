import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] a = new int[N+1];
		for( int i=1; i<=N; i++ ){
			int b = sc.nextInt();
			if( b>N ){
				a[0]++;
			}else{
				a[b]++;
			}
		}
		for( int i=1; i<=N; i++ ){
			if( a[i]>i ){
				a[0] += a[i] - i;				
			}
			if( i>a[i] ){
				a[0] += a[i];
			}
		}
		System.out.println(a[0]);
	}
}
