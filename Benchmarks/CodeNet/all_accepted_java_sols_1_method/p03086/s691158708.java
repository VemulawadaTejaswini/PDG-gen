import java.util.Scanner;

public class Main {
	private static Scanner sc;

	public static void main(String[] args) throws Exception {
		sc = new Scanner(System.in);
		String[] S = sc.nextLine().split("");

		// ACGTのいずれかがでてきたら、ACGT以外がでてくるまでカウント
		// カウントマックスに代入して、それ以降同じように繰り返す。
		int i = 0;
		int max = 0;
		for (String str : S) {
			if (str.equals("A") || str.equals("G") || str.equals("C") || str.equals("T")) {
				i++;
				max = Math.max(i, max);
			} else {
				i = 0;
			}
		}

		System.out.println(max);

	}
}
