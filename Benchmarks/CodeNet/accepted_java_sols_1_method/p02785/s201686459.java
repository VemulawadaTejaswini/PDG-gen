import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] a=new int[N];
		for(int i = 0 ;i < N ; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		long ans = 0 ;
		for ( int i = 0 ; i < N - K  ; i++) ans += a[i];
		System.out.println(ans);
	}
}
