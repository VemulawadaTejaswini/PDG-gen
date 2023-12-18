import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		List<Integer> cost = new ArrayList<>();
		List<Integer> input = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			input.add(sc.nextInt());
		}

		cost.add(0);
		for (int i = 1; i < n; i++) {
			List<Integer> temp = new ArrayList<>();
			for (int j = 1; j <= k; j++) {
				int num = i - j;
				if (num < 0) {
					break;
				}
				int costk = Math.abs(input.get(num) - input.get(i)) + cost.get(num);
				temp.add(costk);
			}
			cost.add(Collections.min(temp));
		}
		System.out.println(cost.get(n - 1));
	}
}
