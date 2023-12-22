import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int q = sc.nextInt();
		int total = 0;
		int count = 0;

		ArrayList<Integer> time = new ArrayList<>();
		ArrayList<String> name = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			name.add(sc.next());
			time.add(sc.nextInt());
		}

		while (time.size() != 0) {
			if (time.get(count) <= q) {
				total += time.get(count);
				System.out.printf("%s %d\n", name.get(count), total);
				time.remove(count);
				name.remove(count);
				count = count >= name.size() ? 0 : count;
			} else {
				total += q;
				time.set(count, time.get(count) - q);
				count = ++count >= name.size() ? 0 : count;

			}

		}

	}
}
