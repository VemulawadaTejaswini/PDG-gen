
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int ten = 0;
		int out = 0;
		List<Integer> list = new ArrayList<Integer>();
		while (true) {
			if (n == 0)
				break;
			String line = scanner.next();
			if (line.equals("HIT")) {
				if (list.size() == 3) {
					ten++;
				} else {
					list.add(0);
				}
			} else if (line.equals("HOMERUN")) {
				ten += list.size() + 1;
				list.clear();
			} else {
				out++;
				if (out == 3) {
					out = 0;
					System.out.println(ten);
					ten = 0;
					list.clear();
					n--;
				}
			}

		}

	}
}