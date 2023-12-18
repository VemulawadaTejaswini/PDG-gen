import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		Long a[] = new Long[n];

		String str[] = br.readLine().split(" ");
		for (int i = 0; i < n; i++) {
			a[i] = Long.parseLong(str[i]);
		}

		Arrays.sort(a, Comparator.reverseOrder());

		long ans = a[0];
		int index = 1;

		for (int i = 1; i < n - 1; i++) {
			ans += a[index];
			//System.out.println(ans + " " + a[index]);
			if (i % 2 == 0)
				index++;
		}
		System.out.println(ans);
	}
}