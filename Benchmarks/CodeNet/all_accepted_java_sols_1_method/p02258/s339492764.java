import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		List<Integer> num = new ArrayList<>();
		List<Integer> min = new ArrayList<>();
		int n, m = Integer.MAX_VALUE, M = Integer.MIN_VALUE;

		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int tmp;

		for (int i = 0; i < n; i++) {
			tmp = sc.nextInt();
			if (tmp < m) {
				m = tmp;
			}
			num.add(tmp);
			min.add(m);
		}
		sc.close();

		for (int i = 1; i < n; i++) {
			tmp = num.get(i) - min.get(i - 1);
			if (tmp > M) {
				M = tmp;
			}
		}
		System.out.println(M);
	}
}

