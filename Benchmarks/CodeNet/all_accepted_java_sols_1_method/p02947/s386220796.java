import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		String str[] = new String[n];
		HashMap<String, Long> map = new HashMap<>();

		long ans = 0;
		for (int i = 0; i < n; i++) {
			String s[] = br.readLine().split("");
			Arrays.sort(s);
			str[i] = "";

			for (int j = 0; j < 10; j++) {
				str[i] += s[j];
			}

			if (map.containsKey(str[i])) {
				long l = map.get(str[i]) + 1;
				ans += l;
				map.put(str[i], l);
			} else {
				map.put(str[i], 0L);
			}
		}

		System.out.println(ans);
	}
}