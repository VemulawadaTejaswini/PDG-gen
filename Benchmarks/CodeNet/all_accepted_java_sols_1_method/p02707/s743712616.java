import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> list = new ArrayList<>();

		for (int i = 1; i < n; i++) {
			int a = sc.nextInt();
			list.add(0);
			list.set(a - 1, list.get(a-1) + 1);
		}

		list.forEach(s -> {
			System.out.println(s);
		});
				System.out.println(0);

		sc.close();
	}

}