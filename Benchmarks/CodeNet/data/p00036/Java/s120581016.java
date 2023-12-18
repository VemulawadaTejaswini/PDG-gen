import java.util.Scanner;

public class Main {

	public static String solve (String[] str) {
		int baseX = 0, baseY = 0;
		main : for (int i = 0; i < str.length; i++) {
			for (int j = 0; j < str[i].length(); j++) {
				if (str[i].charAt(j) == '1') {
					baseX = j;
					baseY = i;
					break main;
				}
			}
		}

		// 右にある？
		if (str[baseY].charAt(baseX + 1) == '1') {

			// 下にある？
			if (str[baseY + 1].charAt(baseX) == '1')
				return str[baseY + 1].charAt(baseX + 1) == '1' ? "A" : "G";
			else
				return str[baseY + 1].charAt(baseX + 1) == '1' ? "E" : "C";

		} else {

			if (str[baseY + 2].charAt(baseX) == '1')
				return "B";
			else
				return str[baseY + 1].charAt(baseX + 1) == '1' ? "F" : "D";

		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (sc.hasNextLine()) {
			String[] str = new String[10];
			for (int i = 0; i < str.length - 2; i++)
				str[i] = sc.nextLine() + "00";
			System.out.println(solve(str) + "\n");
		}

	}

}