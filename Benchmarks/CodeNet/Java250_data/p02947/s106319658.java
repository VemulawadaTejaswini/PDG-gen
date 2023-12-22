import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Map<String, Long> map = new HashMap<>();
		long cnt = 0;

		for ( int i = 0; i < n; i++ ) {
			char[] s = in.next().toCharArray();
			Arrays.sort(s);
			String key = new String(s);

			if(map.containsKey(key)) {
				map.put(key, map.get(key) + 1);
			}else {
				map.put(key, (long) 1);
			}			
		}

		for ( Entry<String, Long> en : map.entrySet() ) {
			// System.out.println(en);
			cnt += nCr(en.getValue(), 2);
		}

		System.out.println(cnt);
		in.close();
	}
	
	private static long nCr(long n, long r) {
		if ( r == 0 ) return 1;
		return n * nCr(n - 1, r - 1) / r;
	}
}
