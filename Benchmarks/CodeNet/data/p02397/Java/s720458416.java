import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;

		ArrayList<Integer> abList = new ArrayList<Integer>();

		while (true) {
			a = sc.nextInt();
			b = sc.nextInt();

			if ((a == 0) && (b == 0))
				break;

			if (a > b) {
				abList.add(b);
				abList.add(a);
			} else {

				abList.add(a);
				abList.add(b);
			}
		}

		for (int i = 0; i < abList.size(); i += 2) {
			System.out.println(abList.get(i) + " " + abList.get(i + 1));
		}

	}
}