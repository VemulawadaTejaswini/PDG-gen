import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// ABC170-C
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int N = sc.nextInt();

		List<Integer> pList = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			pList.add(sc.nextInt());
		}

		if (N == 0) {
			System.out.println(X);
			sc.close();
			return;
		}

		List<Integer> numList = new ArrayList<>();
		for (int i = -1; i <= 101; i++) {
			numList.add(i);
		}

		for (Integer p : pList) {
			numList.remove(p);
		}

		int abs = Integer.MAX_VALUE;
		int pResult = 0;

		for (Integer num : numList) {
			int tmpAbs = Math.abs(X - num);

			if (tmpAbs < abs) {
				abs = tmpAbs;
				pResult = num;
			}

			if (tmpAbs == abs && num < pResult) {
				pResult = num;
			}
		}

		System.out.println(pResult);
		sc.close();
	}
}
