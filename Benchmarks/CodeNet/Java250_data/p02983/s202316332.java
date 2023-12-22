import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long L = sc.nextLong();
		long R = sc.nextLong();
		sc.close();
		long ans = Long.MAX_VALUE;
		for (long i = L; i <= R - 1; i++) {
			for (long j = i + 1; j <= R; j++) {
				ans = Math.min(ans, (i * j) % 2019);
				if (ans == 0) {
					System.out.println(ans);
					return;
				}
			}
		}
		System.out.println(ans);
	}
}
