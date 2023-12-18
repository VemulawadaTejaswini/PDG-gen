import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] X = new int[N];
		for( int i=0; i<N; i++ ){
			X[i] = sc.nextInt();
		}
		int[] ans = new int[100];
		for( int k=1; k<=100; k++ ){
			for( int i=0; i<N; i++ ){
				ans[k-1] += (X[i]-k)*(X[i]-k);
			}
		}
		Arrays.sort(ans);
		System.out.println(ans[0]);      
	}
}