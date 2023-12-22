

import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String sb = null + " ";
		int count = 0;
		String find = scan.nextLine().toLowerCase();
		while (true) {
			String str = scan.nextLine();
			if (str.equals("END_OF_TEXT")) {
				break;
			}
			sb = sb + str.toLowerCase() + " ";
		}
		String[] sss = sb.split(" ");
		for (int i = 0; i < sss.length; i++) {
			if (sss[i].equals(find)) {
				count = count + 1;
			}
		}
		System.out.println(count);
	}
}