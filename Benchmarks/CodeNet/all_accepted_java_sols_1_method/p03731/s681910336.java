import java.util.*;
public class Main {
	
	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		long T = sc.nextLong();
		
		long start = sc.nextLong();
		long ans = T;
		for (int i = 1; i < N; i++) {
			long ti = sc.nextLong();
			ans += Math.min(T, ti - start);
			
			start = ti;
		}
		
		System.out.println(ans);
	}
}