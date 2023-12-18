import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static boolean isLeapYear (int y) {
		if (y % 400 == 0)
			return true;
		else if (y % 100 == 0)
			return false;
		else
			return y % 4 == 0;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<String> out = new ArrayList<String>();

		int a = sc.nextInt();
		int b = sc.nextInt();
		while (true) {
			boolean naFlg = true;
			for (int i = a; i <= b; i++) {
				if (isLeapYear(i)) {
					out.add(i + "");
					naFlg = false;
				}
			}
			if (naFlg) out.add("NA");
			a = sc.nextInt();
			b = sc.nextInt();
			if (a == 0 && b == 0) break;
			out.add("");
		}

		for (String s : out)
			System.out.println(s);

	}

}