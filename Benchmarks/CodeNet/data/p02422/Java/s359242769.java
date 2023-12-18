
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		StringBuilder sb = new StringBuilder(str);
		final String REPLACE = "replace";
		final String REVERSE = "reverse";
		final String PRINT = "print";
		int orderCount = Integer.parseInt(scn.nextLine());

		for (int i = 0; i < orderCount; i++) {
			String order = scn.nextLine();
			String[] aaa = order.split(" ");
			int a = Integer.parseInt(aaa[1]);
			int b = Integer.parseInt(aaa[2])+1;
			if (aaa[0].equals(PRINT)) {
				System.out.println(sb.substring(a, b).toString());
			} else if (aaa[0].equals(REVERSE)) {
				StringBuilder sbs = new StringBuilder(sb.substring(a, b));
				String bbb= sbs.reverse().toString();
				sb.replace(a, b, bbb);
			} else if (aaa[0].equals(REPLACE)) {
				sb.replace(a, b, aaa[3]);
			}
		}
	}
}

