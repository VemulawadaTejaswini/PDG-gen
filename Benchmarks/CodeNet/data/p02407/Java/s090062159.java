import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> i = new ArrayList<Integer>();

		int n = sc.nextInt();

		for (int x = 0; x < n; x++) {

			i.add(sc.nextInt());

		}
		for (int y = i.size() - 1; y >= 0; y--) {

			if (y != i.size() - 1) {
				System.out.print(" ");
			}

			System.out.print(i.get(y));

		}
		System.out.println();
		sc.close();
	}

}