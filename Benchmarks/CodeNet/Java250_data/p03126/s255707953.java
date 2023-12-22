import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();

		Set<Integer> foods = new HashSet<Integer>();
		for (int i = 0; i < m; i++) {
			foods.add(i+1);
		}

		Set<Integer> nextFoods = new HashSet<Integer>();
		for (int i = 0; i < n; i++) {
			int k = scanner.nextInt();
			for (int j = 0; j < k; j++) {
				int a = scanner.nextInt();
				if (foods.contains(a)) {
					nextFoods.add(a);
				}
			}
			foods = nextFoods;
			nextFoods = new HashSet<Integer>();
		}

		System.out.println(foods.size());

	}

}
