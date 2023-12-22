import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] t = new int[N+1];
		int[] x = new int[N+1];
		int[] y = new int[N+1];
		for( int i=1; i<=N; i++ ){
			t[i] = sc.nextInt();
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
		}
		for( int i=1; i<=N; i++ ){
			int a = (x[i]-x[i-1])+(y[i]-y[i-1]);
			int b = t[i]-t[i-1];
			if( a>b || (b-a)%2!=0 ){
				System.out.println("No");
				break;
			}
			if( i==N ){
				System.out.println("Yes");
			}
		}
	}
}
