import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static long CONST = (long) Math.pow(10, 9) + 7L;

	static Main instance = new Main();

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		//入力値
		int N = scan.nextInt();

		HashSet<String> set = new HashSet<>();

		for (int i = 0; i < N; i++) {
			set.add(scan.next());
		}

		//WK変数

		//演算

		//結果出力
		System.out.println(set.size());
	}
}