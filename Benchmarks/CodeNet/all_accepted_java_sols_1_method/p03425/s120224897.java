import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String[] s = new String[n];

		for (int i = 0; i < n; i++) {
			s[i] = sc.next();
		}

		HashMap<Character, Integer> hm = new HashMap<>();

		for (int i = 0; i < n; i++) {
			hm.put(s[i].charAt(0), hm.getOrDefault(s[i].charAt(0), 0) + 1);
		}

		char[] c = { 'M', 'A', 'R', 'C', 'H' };
		int[] ar = new int[5];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = hm.getOrDefault(c[i], 0);
			//			System.out.println(ar[i]);
		}

		long ans = 0l;
		ans += (long) ar[0] * ar[1] * ar[2];
		ans += (long) ar[0] * ar[1] * ar[3];
		ans += (long) ar[0] * ar[1] * ar[4];
		ans += (long) ar[0] * ar[2] * ar[3];
		ans += (long) ar[0] * ar[2] * ar[4];
		ans += (long) ar[0] * ar[3] * ar[4];
		ans += (long) ar[1] * ar[2] * ar[3];
		ans += (long) ar[1] * ar[2] * ar[4];
		ans += (long) ar[1] * ar[3] * ar[4];
		ans += (long) ar[2] * ar[3] * ar[4];

		System.out.println(ans);
		sc.close();
	}
}
