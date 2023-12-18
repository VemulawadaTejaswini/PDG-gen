
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int p = scanner.nextInt();
			int q = scanner.nextInt();
			List<Integer> list = new ArrayList<Integer>();
			while (true) {
				p *= 10;
				System.out.print(p / q);
				p = p % q;
				if (p == 0 || list.contains(p)) {
					break;
				}
				list.add(p);
			}

			System.out.println();
			if (p != 0 && list.contains(p)) {
				System.out.print(' ');
				char a = ' ';
				for (int t : list) {
					if (t == p) {
						a = '^';
					}
					System.out.print(a);
				}
				System.out.println();
			}
		}
	}
}