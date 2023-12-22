import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 整数の入力
		int n = sc.nextInt();
		ArrayList<Integer> aryNum = new ArrayList<Integer>();

		for (int i = 0; i < n; i++) {
			aryNum.add(sc.nextInt());
		}

		Collections.sort(aryNum, Collections.reverseOrder());

		int maxLength = aryNum.get(0);
		aryNum.remove(0);

		int sumLength = 0;

		for (int val : aryNum) {
			sumLength = sumLength + val;
		}

		if (maxLength < sumLength) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

		sc.close();
	}
}