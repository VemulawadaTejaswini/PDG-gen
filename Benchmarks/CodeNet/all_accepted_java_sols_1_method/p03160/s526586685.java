import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> cost = new ArrayList<>();
		List<Integer> input = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			input.add(sc.nextInt());
		}
		cost.add(0);
		cost.add(Math.abs(input.get(0) - input.get(1)));
		for (int i = 2; i < n; i++) {
			int cost1 = Math.abs(input.get(i - 1) - input.get(i)) + cost.get(i - 1);
			int cost2 = Math.abs(input.get(i - 2) - input.get(i)) + cost.get(i - 2);
			cost.add(Math.min(cost1, cost2));
		}
		System.out.println(cost.get(n - 1));
	}
}
