import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		sc.nextLine();
		String s = sc.nextLine();

		List<Integer> a = new ArrayList<>();
		int current = 1;
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (s.charAt(i) == '0' + current) count++;
			else {
				current = 1 - current;
				a.add(count);
				count = 1;
			}
		}

		a.add(count);
		if (a.size() % 2 == 0) a.add(0);

		int[] sum = new int[a.size() + 1];
		for (int i = 1; i < a.size() + 1; i++) {
			sum[i] = sum[i - 1] + a.get(i - 1);
		}

		int answer = 0;
		for (int i = 0; i < a.size(); i += 2) {
			int l = i;
			int r = Math.min(l + 2 * k + 1, a.size());
			answer = Math.max(answer, sum[r] - sum[l]);
		}
		System.out.println(answer);
	}
}
