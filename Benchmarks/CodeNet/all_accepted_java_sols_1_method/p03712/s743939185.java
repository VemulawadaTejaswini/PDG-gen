import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int h1 = 0;
		int h2 = 0;
		Scanner sc = new Scanner(System.in);
		h1 = sc.nextInt();
		h2 = sc.nextInt();
		sc.nextLine();
		String strValue = "";
		for (int i = 0; i < h1 + 2; i++) {
			strValue = "#";
			if (i == 0 || i == h1 + 1) {
				for (int j = 0; j < h2; j++) {
					strValue += "#";
				}
			} else {
				strValue += sc.nextLine();
			}
			strValue += "#";
			System.out.println(strValue);
		}
		sc.close();
	}
}