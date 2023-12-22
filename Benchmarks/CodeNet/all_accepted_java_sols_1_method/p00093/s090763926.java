
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count = 0;
		while (true) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			if (a == 0 && b == 0)
				break;
			List<Integer> list = new ArrayList<Integer>();
			for (int i = a; i <= b; i++) {
				if (i % 400 == 0 || (i % 4 == 0 && i % 100 != 0)) {
					list.add(i);
				}
			}
			if (count != 0) {
				System.out.println();
			}
			if (list.size() == 0) {
				System.out.println("NA");
			} else {
				for (int t : list)
					System.out.println(t);
			}
			count++;
		}
	}

}