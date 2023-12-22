import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String l1 = scan.nextLine();
		String l2 = scan.nextLine();
		scan.close();

		int h = Integer.valueOf(l1.split(" ")[0]);
		int n = Integer.valueOf(l1.split(" ")[1]);
		String strA = l2;
		List<Integer> a = new ArrayList<Integer>();
		for (String element : strA.split(" ")) {
			a.add(Integer.valueOf(element));
		}

		for (Integer element : a) {
			h = h - element;

			if (h <= 0) {
				System.out.println("Yes");
				return;
			}
		}

		System.out.println("No");
	}
}
