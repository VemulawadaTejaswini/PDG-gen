import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String str;
		String s;
		int count;

		str = sc.nextLine();
		s = "";
		count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ' || str.charAt(i) == ',' || str.charAt(i) == '.') {
				if (3 <= count && count <= 6) {
					System.out.print(s);
					for (int j = count; 0 < j; j--) {
						System.out.print(str.charAt(i - j));
					}
					s = " ";
				}
				count = 0;
			} else {
				count++;
			}
		}
		System.out.println();
	}
}