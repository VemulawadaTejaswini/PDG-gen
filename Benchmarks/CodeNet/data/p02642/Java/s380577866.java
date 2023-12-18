import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;

public class Main {

	static int count = 0;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		String str[] = br.readLine().split(" ");
		int a[] = new int[n];

		int num[] = new int[1000000];

		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(str[i]);
			num[a[i]]++;
		}

		Arrays.sort(a);

		Set<Integer> set = new HashSet<>();

		for (int i = 0; i < n; i++) {
			ArrayList<Integer> list = divisor(a[i]);

			boolean flag = false;
			for (int j = 0; j < list.size(); j++) {
				if (set.contains(list.get(j))) {
					flag = true;
					break;
				}
			}

			if (!flag) {
				set.add(a[i]);
				count++;
			}
		}

		set.forEach(new Consumer<Integer>() {
			@Override
			public void accept(Integer t) {
				if (num[t] != 1) {
					count--;
				}
			}
		});

		System.out.println(count);
	}

	public static final ArrayList<Integer> divisor(final int n) {
		final ArrayList<Integer> list = new ArrayList<>();

		for (int i = 1; i * i <= n; i++) { // √n
			if (n % i == 0) {
				list.add(i); // a x b
				if (i != n / i) {
					list.add(n / i); // b x a (逆向き)
				}
			}
		}
		return list;
	}
}
