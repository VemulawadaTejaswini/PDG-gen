import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 入力値の取得
		Set<Integer> AB = new HashSet<>();
		AB.add(sc.nextInt());
		AB.add(sc.nextInt());
		
		// 結果の出力
		if (!AB.contains(1)) {
			System.out.println(1);
		}
		else if (!AB.contains(2)) {
			System.out.println(2);
		}
		else {
			System.out.println(3);
		}
		
		sc.close();
	}
}
