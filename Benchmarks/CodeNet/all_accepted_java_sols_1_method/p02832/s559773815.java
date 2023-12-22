import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] a = new int[N];
		for( int i=0; i<N; i++ ){
			a[i] = sc.nextInt();
		}
		int b = 1;
		int count = 0;
		for( int i=0; i<N; i++ ){
			if( a[i]==b ){
				count++;
				b++;
			}
		}
		if( count==0 ){
			count = N+1;
		}
		System.out.println(N-count);
	}
}
