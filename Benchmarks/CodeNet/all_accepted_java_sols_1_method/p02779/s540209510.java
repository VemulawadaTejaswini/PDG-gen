import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		ArrayList<Integer> lList = new ArrayList<>();

		for (int index = 1; index <= N; index++) {
			int n = sc.nextInt();
			lList.add(n);
		}

		Collections.sort(lList);

		for (int x = 0; x < (N - 1); x++) {
			if (lList.get(x).equals(lList.get(x + 1))) {
				System.out.println("NO");
				return;
			}
		}
		System.out.println("YES");
	}
}