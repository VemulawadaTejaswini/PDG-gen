import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		int ans = 0;
		for (int c = 1; c < n; c++) {
			List<Integer> list = divList(n - c);
			ans += list.size();
		}
		System.out.println(ans);
	}

	static List<Integer> divList(int n) {
		List<Integer> list = new ArrayList<>();
		int end = (int) Math.sqrt(n);
		for (int i = 1; i <= end; i++) {
			if (n % i == 0) {
				list.add(i);
			}
		}
		int i = end * end == n ? list.size() - 2 : list.size() - 1;
		for ( ; i >= 0; i--) {
			list.add(n / list.get(i));
		}
		return list;
	}
}
