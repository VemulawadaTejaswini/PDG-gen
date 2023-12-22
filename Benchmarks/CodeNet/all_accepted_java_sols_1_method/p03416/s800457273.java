import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();

		int cnt = 0;
		boolean bo = true;
		for (int i = a; i <= b; i++) {
			String s = String.valueOf(i);
			for (int j = 0; j < s.length() / 2; j++) {
				if (s.charAt(j) == s.charAt(s.length() - 1 - j)) {
					continue;
				} else {
					bo = false;
					break;
				}
			}
			if (bo) {
				cnt++;
			}
			bo = true;
		}
		
		System.out.println(cnt);

	}
}
