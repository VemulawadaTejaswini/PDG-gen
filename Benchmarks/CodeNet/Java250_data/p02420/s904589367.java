import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str, str2;
		while (true) {
			str = sc.next();
			if (str.equals("-"))
				break;
			str2 = "";
			int shuffulNum = sc.nextInt();
			for (int i = 0; i < shuffulNum; i++) {
				int n = sc.nextInt();
				for (int j = n; j < str.length(); j++) {
					str2 += str.charAt(j);
				}
				for (int j = 0; j < n; j++) {
					str2 += str.charAt(j);
				}
				str = str2;
				str2 = "";
			}
			System.out.println(str);
		}
	}
}