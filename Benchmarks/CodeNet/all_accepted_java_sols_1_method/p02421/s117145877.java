import java.util.Scanner;

public class Main {
	public static void main(String[] arges) {

		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] k = new String[Integer.parseInt(line)];

		for (int i = 0; i < k.length; i++) {
			k[i] = sc.nextLine();
		}
		int tarou = 0;
		int hanako = 0;
		for (String string : k) {
			String[] tehuda = string.split(" ");

			if (tehuda[0].compareToIgnoreCase(tehuda[1]) > 0) {
				tarou += 3;
			} else if (tehuda[0].compareToIgnoreCase(tehuda[1]) < 0) {
				hanako += 3;
			} else {
				tarou += 1;
				hanako += 1;
			}
		}System.out.println(tarou+" "+hanako);
	}
}