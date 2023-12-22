import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		int a;

		Scanner sc = new Scanner(System.in);

		a = sc.nextInt();

		String[] ArrayA = new String[a];
		HashMap<String, Integer> hm = new HashMap<>();

		for(int i = 0; i < ArrayA.length; i++) {
			String b = sc.next();
			char[] c = b.toCharArray();
			Arrays.sort(c);
			hm.put(String.valueOf(c), hm.getOrDefault(String.valueOf(c), 0) + 1);
		}

		long ans = 0;
		for (String s : hm.keySet()) {
			ans += nc2(hm.get(s));
		}

		System.out.println(ans);
	}

	private static long nc2(long x) {
		return (x * (x - 1)) / 2;
	}


}
