import java.util.Arrays;
import java.util.Scanner;

/**
 * https://beta.atcoder.jp/contests/abc077/tasks/arc084_a
 */
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N];
		int[] b = new int[N];
		int[] c = new int[N];
		for(int i=0; i<N; i++) a[i] = Integer.parseInt(sc.next());
		for(int i=0; i<N; i++) b[i] = Integer.parseInt(sc.next());
		for(int i=0; i<N; i++) c[i] = Integer.parseInt(sc.next());
		sc.close();
		
		Arrays.sort(a);
		Arrays.sort(b);
		Arrays.sort(c);
		
		long[] dpb = new long[N];
		int ci = 0;
		for(int i=0; i<N; i++){
			while(ci<N && b[i]>=c[ci]) ci++;
			dpb[i] = N-ci;
		}
		for(int i=N-2; i>=0; i--){
			dpb[i] = dpb[i]+dpb[i+1];
		}
		int bi = 0;
		long ans = 0;
		for(int i=0; i<N; i++){
			while(bi<N && a[i]>=b[bi]) bi++;
			if(bi>=N) break;
			ans += dpb[bi];
		}
		
		System.out.println(ans);

	}

}