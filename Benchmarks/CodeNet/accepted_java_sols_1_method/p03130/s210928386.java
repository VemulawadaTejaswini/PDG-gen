import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 整数の入力
		int a1 = sc.nextInt();
		int b1 = sc.nextInt();
		int a2 = sc.nextInt();
		int b2 = sc.nextInt();
		int a3 = sc.nextInt();
		int b3 = sc.nextInt();

		ArrayList<Integer> aryPath = new ArrayList<Integer>();

		aryPath.add(a1);
		aryPath.add(a2);
		aryPath.add(a3);
		aryPath.add(b1);
		aryPath.add(b2);
		aryPath.add(b3);

		ArrayList<Integer> aryCnt = new ArrayList<Integer>();

		aryCnt.add(Collections.frequency(aryPath, 1));
		aryCnt.add(Collections.frequency(aryPath, 2));
		aryCnt.add(Collections.frequency(aryPath, 3));
		aryCnt.add(Collections.frequency(aryPath, 4));

		if (Collections.frequency(aryCnt, 2) == 2) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

		sc.close();
	}
}
