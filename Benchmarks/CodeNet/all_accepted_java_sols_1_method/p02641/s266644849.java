import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int x = scan.nextInt();
		int n = scan.nextInt();
		List<Integer> p = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			int a = scan.nextInt();
			p.add(a);
		}

		for (int i = 0; i < 100; i++) {
			if (!p.contains(x - i)) {
				System.out.println(x - i);
				break;
			} else if (!p.contains(x + i)) {
				System.out.println(x + i);
				break;
			}
		}
	}
}