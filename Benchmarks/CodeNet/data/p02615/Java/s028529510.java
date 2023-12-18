import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long[] as = new long[(int)n];
		for(long i=0; i<n; i++){
			as[(int)i] = sc.nextLong();
		}
		Arrays.sort(as);
		long ans = 0;
		for(int i=1; i<n; i++){
			ans += as[i];
		}
		System.out.println(ans);

	}
}
