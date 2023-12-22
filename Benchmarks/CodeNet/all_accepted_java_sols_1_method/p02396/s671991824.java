import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;

		ArrayList<Integer> nList = new ArrayList<Integer>();

		while (true) {
			n = sc.nextInt();
			if (n == 0)
				break;

			nList.add(n);
		}

		for (int i = 1; i <= nList.size(); i++) {
			System.out.println("Case " + i + ": " + nList.get(i - 1));
		}

	}
}