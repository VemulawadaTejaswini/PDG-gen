import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		long[] X = new long[N+1];
		long[] xx = new long[N+1];
		for( int i=1; i<=N; i++ ){
			X[i] = sc.nextLong();
			xx[i] = X[i];
		}
		Arrays.sort(xx);
		long med1 = xx[N/2];
		long med2 = xx[N/2+1];
		for( int i=1; i<=N; i++ ){
			if( X[i]<=med1 ){
				System.out.println(med2);
			}else{
				System.out.println(med1);
			}
		}
	}
}
