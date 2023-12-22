import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		while (true) {
			if (list.indexOf(s) != -1) {
				System.out.println(list.size() + 1);
				System.exit(0);
			}
			list.add(s);
			if (s % 2 == 0) {
				s /= 2;
			} else {
				s = 3 * s + 1;
			}
		}
	}
}
