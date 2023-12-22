import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		List<Integer> list = new ArrayList<>();
		int sumA = 0;

		for (int i = 0; i < n; i++) {
			list.add(scanner.nextInt());
			sumA += list.get(i);
		}

		int ans = 0;
		int harf = (int) Math.round( (double) sumA / list.size()) ;;
			for (int i : list) {
				ans += (i - harf) * (i - harf);
			}
		

		System.out.println(ans);
	}
}