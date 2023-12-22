import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		Map<Long,Long> map = new HashMap<>();
		long sum = 0;
		for(long i = 0 ; i < n ; i++) {
			long a = sc.nextLong();
			sum += a;
			map.put(a , map.getOrDefault(a, 0L) + 1L);
		}
		long q = sc.nextLong();

		for(long i = 0 ; i < q ; i++) {
			long b = sc.nextLong();
			long c = sc.nextLong();
			sum += (c - b) * map.getOrDefault(b, 0L);
			System.out.println(sum);
			map.put(c , map.getOrDefault(c, 0L) + map.getOrDefault(b, 0L));
			map.put(b, 0L);
		}


		sc.close();


	}

}
