import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] str = sc.nextLine().split(" ");
		ap_change(str);
		sc.close();
	}

	private static void ap_change(String[] str) {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < str.length; i++) {

			if (str[i].matches(".*apple.*")) {
				str[i] = str[i].replaceAll("apple", "peach");
			} else if (str[i].matches(".*peach.*")) {
				str[i] = str[i].replaceAll("peach" ,"apple");
			}

		sb.append(str[i]);

			if (i < str.length - 1) {
				sb.append(" ");
			}
		}
		System.out.println(sb.toString());
	}
}
