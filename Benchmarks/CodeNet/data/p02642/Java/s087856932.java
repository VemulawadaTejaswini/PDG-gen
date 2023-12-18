import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {

	static Main instance = new Main();

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		SortedSet<Integer> set = new TreeSet<>();

		for (int i = 1; i <= 1000000; i++) {
			set.add(i);
		}

		//入力値取得
		int N = scan.nextInt();

		List<Integer> AList = new ArrayList<>();
		SortedSet<Integer> dpl = new TreeSet<>();

		for (int i = 0; i < N; i++) {
			int A = scan.nextInt();

			if (dpl.contains(A)) {
				set.remove(A);
			} else {
				dpl.add(A);
				AList.add(A);
			}
		}

		//WK変数

		for (int A : AList) {
				for (int j = 2; j * A <= 1000000; j++) {
					set.remove(j * A);
				}
		}

		//演算
		int result = 0;

		for (int A : AList) {
			if (set.contains(A)) {
				result++;
			}
		}

		//結果出力
		System.out.println(result);
	}
}