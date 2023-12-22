import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] L = new int[M];
		int[] R = new int[M];
		for( int i=0; i<M; i++ ){
			L[i] = sc.nextInt();
			R[i] = sc.nextInt();
		}
		Arrays.sort(L);
		Arrays.sort(R);
		int ans = 0;
		if( R[0]-L[M-1]>=0 ){
			ans = R[0]-L[M-1]+1;
		}
		System.out.println(ans);
	}
}
