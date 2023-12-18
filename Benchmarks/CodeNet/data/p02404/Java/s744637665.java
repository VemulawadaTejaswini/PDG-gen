import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> result = new ArrayList<Integer>();
		String[] n;

		while (true) {

			String line = sc.nextLine();
			n = line.split(" ");

			if (n[0].equals("0") && n[1].equals("0")) {
				break;
			}
			int a = Integer.parseInt(n[0]);
			int b = Integer.parseInt(n[1]);
			for (int i = 0; i < a; i++) {
				for (int j = 0; j < b; j++) {
					if (i > 0 && i < a - 1 && j > 0 && j < b - 1) {
						System.out.print(".");
					} else {
						System.out.print("#");
					}
				}
				System.out.println("");
			}

			System.out.println("");

		}
	}

}

