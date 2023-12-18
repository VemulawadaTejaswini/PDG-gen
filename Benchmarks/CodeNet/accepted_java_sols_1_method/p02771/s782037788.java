import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		//A
		int A = sc.nextInt();
		//B
		int B = sc.nextInt();
		//C
		int C = sc.nextInt();

		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(A);
		list.add(B);
		list.add(C);

		int v = 1;

		Set<Integer> checkHash = new HashSet<Integer>();

		for (int value : list) {
			if (checkHash.contains(value)) {
				// 重複があれば値を加算
				v = v + 1;
			} else {
				// 重複しなければハッシュセットへ追加
				checkHash.add(value);
			}
		}

		if (v == 2) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}
}
