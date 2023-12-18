

import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (true) {
			try {
				String[] str = scan.nextLine().split(" ");
				int a = Integer.parseInt(str[0]);
				int b = Integer.parseInt(str[1]);
				int c = a + b;
				int count = 10;
				int result = 0;
				for (int i = 1; i < 7; i++) {
					if ((c - count) < 0) {
						result = i;
						break;
					}
					count = count * 10;
				}
				System.out.println(result);
			} catch (NumberFormatException ex) {
				break;
			}
		}
	}

}