import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<Integer> A = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);

		int q = sc.nextInt();

		for (int i = 0; i < q; i++) {
			int qa = sc.nextInt();

			if (qa == 0) {
				int x = sc.nextInt();
				A.add(x);

			} else if (qa == 1 && A.size() != 0) {
				int x = sc.nextInt();
				System.out.println(A.get(x));

			} else if (qa == 2 && A.size() != 0) {
				A.remove(A.size() - 1);
			}
		}
		sc.close();

	}

}

