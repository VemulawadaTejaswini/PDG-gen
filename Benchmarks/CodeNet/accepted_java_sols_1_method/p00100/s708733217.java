
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int n = scanner.nextInt();
			if (n == 0) {
				break;
			}
			boolean flag = false;
			List<Integer> list = new ArrayList<Integer>();
			long[] num = new long[4001];
			for (int i = 0; i < n; i++) {
				int a = scanner.nextInt();
				long b = scanner.nextInt();
				long c = scanner.nextInt();
				num[a] += b * c;
				if (!list.contains(a)) {
					list.add(a);
				}

			}
			for (int t : list) {
				if (num[t] >= 1000000) {
					flag = true;
					System.out.println(t);
				}
			}
			if (!flag) {
				System.out.println("NA");
			}
		}
	}
}