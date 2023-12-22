import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		String[] s = str.split("");

		int max = 0;
		int count = 0;
		for (int i = 0; i < s.length; i++) {
			if (s[i].equals("A")) {
				for (int j = i; j < s.length; j++) {
					count++;
					if (s[j].equals("Z")) {
						max = Math.max(max, count);
					}
				}
				break;
			}
		}

		System.out.println(max);

	}
}
