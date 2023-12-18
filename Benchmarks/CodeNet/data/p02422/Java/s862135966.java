
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
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
				System.out.println(str.substring(a, b));
			} else if (aaa[0].equals(REVERSE)) {
				StringBuffer sb = new StringBuffer(str.substring(a, b));
				str = str.replace(sb, sb.reverse().toString());
			} else if (aaa[0].equals(REPLACE)) {
				str=str.replace(str.substring(a, b), aaa[3]);
			}
		}
	}
}

