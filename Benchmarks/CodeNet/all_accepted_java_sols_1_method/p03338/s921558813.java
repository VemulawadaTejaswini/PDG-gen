import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		String str[] = br.readLine().split("");

		int max = 0;
		for (int i = 0; i < n; i++) {
			Set<String> front = new HashSet<>();
			Set<String> back = new HashSet<>();

			for (int j = 0; j < i; j++) {
				front.add(str[j]);
			}

			for (int j = i; j < n; j++) {
				back.add(str[j]);
			}

			int count = 0;
			for (String s : front) {
				if (back.contains(s)) {
					count++;
				}
			}

			max = Math.max(max, count);
		}

		System.out.println(max);
	}
}