import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		final int n = sc.nextInt();

		List<Integer> a = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			a.add(sc.nextInt());
		}

		sc.close();

		Collections.sort(a);
		Collections.reverse(a);

		System.out.print(a.get(0) - a.get(a.size() - 1));

	}

}