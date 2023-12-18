import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] A = new int[N+1];
		int[] aa = new int[N];
		int count = 0;
		int ans = 0;
		for( int i=1; i<=N; i++ ){
			A[sc.nextInt()]++;
		}
		for( int i=1; i<=N; i++ ){
			if( A[i]>0 ){
				aa[count] = A[i];
				count++;
			}
		}
		int[] AA = new int[count];
		for( int i=0; i<count; i++ ){
			AA[i] = aa[i];
		}
		Arrays.sort(AA);
		if( count<=K ){
			ans = 0;
		}else{
			for( int i=0; i<count-K; i++ ){
				ans += AA[i];
			}
		}
		System.out.println(ans);     
	}
}
