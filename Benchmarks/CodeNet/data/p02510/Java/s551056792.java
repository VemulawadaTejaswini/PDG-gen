

import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str, temp;
		String data;
		while (true) {
			str = scan.nextLine();
			if (str.equals("-")) {
				break;
			}
			data = str;
			int moji = data.length();
			int count = Integer.parseInt(scan.nextLine());
			for (int i = 0; i < count; i++) {
				int h = Integer.parseInt(scan.nextLine());
				temp = data.substring(0, h);
				data = data.substring(h, moji) + temp;
			}
			System.out.println(data);

		}
	}
}