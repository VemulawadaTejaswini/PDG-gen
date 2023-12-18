import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String W = (sc.nextLine()).toUpperCase();

		String T = "";
		int count = 0;
		while (true) {
			T = sc.nextLine();
			if (T.equals("END_OF_TEXT")) {
				break;
			}
			String[] str = T.split(" ", -1);
			for (int i = 0; i < str.length; i++) {
				if ((str[i].toUpperCase()).equals(W)) {
					count++;
				}
			}

		}
		System.out.println(count);
	}
}