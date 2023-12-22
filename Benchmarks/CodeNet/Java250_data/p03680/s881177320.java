import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(br.readLine());
		}

		int now = 1;
		Set<Integer> set = new HashSet<>();
		set.add(1);

		for (int i = 0;; i++) {
			now = a[now - 1];
			if (set.contains(now)) {
				System.out.println("-1");
				return;
			}
			if (now == 2) {
				System.out.println(i + 1);
				return;
			}
			set.add(now);
		}
	}
}