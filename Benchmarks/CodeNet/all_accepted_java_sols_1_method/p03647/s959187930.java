import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] a = new int[M];
		int[] b = new int[M];
		int count = 1;
		int[] land = new int[N+1];     
		for( int i=0; i<M; i++ ){
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
			if( a[i]==1 ){
				land[count] = b[i];
				count++;
			}
			if( b[i]==N ){
				land[count] = a[i];
				count++;
			}           
		}       
		Arrays.sort(land);  
		for( int i=N-count+1; i<=N-1; i++ ){
			if( land[i]==land[i+1] ){
				System.out.println("POSSIBLE");
				break;
			}
			if( i==N-1 ){
				System.out.println("IMPOSSIBLE");
			}
		}
	}
}
