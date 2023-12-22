import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long min = sc.nextLong();
		long max = sc.nextLong();
		if(min / 2019 != max / 2019) {
			System.out.println(0);
			return;
		}
		long ans = 2200;
		for(long i = min; i <= max; i ++) {
			for(long j = i + 1; j <= max; j ++) {
				ans = Math.min(ans , (i * j) % 2019);
			}
		}
		System.out.println(ans);
	}
}