import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		String str[] = new String[n];
		for (int i = 0; i < n; i++) {
			String s[] = br.readLine().split("");
			Arrays.sort(s);
			str[i] = "";

			for (int j = 0; j < 10; j++) {
				str[i] += s[j];
			}
		}

		Arrays.sort(str);

		long ans = 0;
		int j = 1;

		for (int i = 0; i < n; i++) {
			if (i == j) {
				j++;
			}
			while (j < n && str[i].equals(str[j])) {
				ans += j - i;
				j++;
			}

		}

		System.out.println(ans);
	}
}