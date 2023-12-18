import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			List<Integer> list = new ArrayList<>();
			for (int i = 0; i < n; i++) {
				list.add(sc.nextInt());
			}
			int sum = 0;
			for (int i = 0; i < k; i++) {
				sum += list.get(i);
			}
			int tmp = sum;
			for (int i = k; i < n; i++) {
				tmp -= list.get(i - k);
				tmp += list.get(i);
				if (sum < tmp) {
					sum = tmp;
				}
			}
			System.out.println((0.0 + sum + k) / 2);
		}
	}

}
