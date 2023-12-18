import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < n; i++) {

			int a = sc.nextInt();

			list.add(a);

		}

		double ave = list.stream().mapToDouble(Double::valueOf).average().getAsDouble();

		List<Double> ans = new ArrayList<>();
		for (int num : list) {

			ans.add(Math.abs(ave - num));
		}

		double min = ans.stream().mapToDouble(Double::valueOf).min().getAsDouble();


		int place = ans.indexOf(min);
		// System.out.println(ave);
		System.out.println(place);


		sc.close();

	}
}