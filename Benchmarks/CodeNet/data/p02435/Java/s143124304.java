import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<List<Integer>> A = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			ArrayList<Integer> B = new ArrayList<>();
			A.add(B);
		}
		int q = sc.nextInt();
		for (int i = 0; i < q; i++) {
			int x = sc.nextInt();
			if (x == 0) {
				int y = sc.nextInt();
				int z = sc.nextInt();
				A.get(y).add(z);
			} else if (x == 1) {
				int y = sc.nextInt();
				if (A.get(y).size() != 0) {
					System.out.println(A.get(y).get(A.get(y).size() - 1));
				}
			} else if (x == 2) {
				int y = sc.nextInt();
				if (A.get(y).size() != 0) {
					A.get(y).remove(A.get(y).size() - 1);
				}
			}
		}
		sc.close();

	}

}


