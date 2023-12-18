import java.util.*;
import java.lang.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int X = sc.nextInt();
		int Y = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		long[] aa = new long[A];
		long[] bb = new long[B];
		long[] P = new long[X+Y+C];
		int count = 0;
		for( int i=0; i<A; i++ ){
			aa[i] = sc.nextLong();
		}
		for( int i=0; i<B; i++ ){
			bb[i] = sc.nextLong();
		}
		for( int i=0; i<C; i++ ){
			long cc = sc.nextLong();
			P[count] = cc;
			count++;
		}
		Arrays.sort(aa);
		Arrays.sort(bb);
		for( int i=A-1; i>A-1-X; i-- ){
			P[count] = aa[i];
			count++;	
		}
		for( int i=B-1; i>B-1-Y; i-- ){
			P[count] = bb[i];
			count++;
		}
		Arrays.sort(P);
		long ans = 0;
		for( int i=C; i<X+Y+C; i++ ){
			ans += P[i];
		}
		System.out.println(ans);
	}
}
