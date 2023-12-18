import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		List<Integer> input = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			input.add(sc.nextInt());
		}
		input.sort((i, j) -> i - j);
		if (input.get(0) == input.get(input.size() - 1)) {
			System.out.println(0);
			System.exit(0);
		}
		List<Integer> res = new ArrayList<>();
		loop: for (int i : input) {
			for (int resInt : res) {
				if (i % resInt == 0) {
					if (i == resInt) {
						res.remove(Integer.valueOf(i));
					}
					continue loop;
				}
				if (resInt > i / 2) {
					res.add(i);
					continue loop;
				}
			}
			res.add(i);
		}
		System.out.println(res.size());
	}
}