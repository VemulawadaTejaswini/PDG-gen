import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();	//軒数
		int M = sc.nextInt();	//ほしい本数
		long[] a = new long[N];
		long[] b = new long[N];


		Map<Long, Long> tMap = new TreeMap<Long, Long>();
		for (int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
			if(tMap.containsKey((a[i]))) {
				tMap.put((a[i]), tMap.get(a[i]) + b[i]);
			} else {
				tMap.put(a[i], b[i]);
			}
		}

		long ans = 0;
		for(Map.Entry<Long, Long> entry : tMap.entrySet()) {
			long buy = Math.min(M, entry.getValue());

			ans += buy * entry.getKey();

			M -= buy;
		}

		System.out.println(ans);

		sc.close();
	}
}