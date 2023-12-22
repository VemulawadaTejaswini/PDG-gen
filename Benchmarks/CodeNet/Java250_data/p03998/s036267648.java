import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String tmp = in.nextLine();
		char[][] input = new char[3][];
		input[0] = tmp.toCharArray();
		tmp = in.nextLine();
		input[1] = tmp.toCharArray();
		tmp = in.nextLine();
		input[2] = tmp.toCharArray();

		String ans = "";
		int id = 0;
		int[] n = new int[3];
		while (true) {
			n[id] = n[id] + 1;
			if (n[0] > input[0].length) {
				ans = "A";
				break;

			}
			if (n[1] > input[1].length) {
				ans = "B";
				break;

			}
			if (n[2] > input[2].length) {
				ans = "C";
				break;
			}

			char next = input[id][n[id]-1];
			if (next == 'a') {
				id = 0;
			}
			if (next == 'b') {
				id = 1;
			}
			if (next == 'c') {
				id = 2;
			}
		}

		// 出力
		System.out.println(ans);
	}
}