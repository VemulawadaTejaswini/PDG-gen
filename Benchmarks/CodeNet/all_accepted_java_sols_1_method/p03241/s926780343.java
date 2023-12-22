import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.OptionalInt;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		double rtm = Math.sqrt(m);

		List<Integer> list = new ArrayList<Integer>();

		for (int i = 1; i <= rtm; i++) {

			if (m % i == 0) {
				list.add(i);
				list.add(m / i);
			}
		}

		Collections.sort(list);

		OptionalInt ans = list.stream()
				.mapToInt(Integer::intValue)
				.filter(i -> i <= m / n)
				.max();

		System.out.println(ans.getAsInt());
	}
}