import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			int n = sc.nextInt();
			sc.nextLine();
			String s = sc.next();

			int first = s.indexOf('I');
			int end = s.lastIndexOf('I');

			if (first == -1) {
				System.out.println(0);
				return;
			}

			int x = 0 - first + 1;
			int max = x > 0 ? x : 0;
			for (int i = first + 1; i <= end; i++) {
				if (s.charAt(i) == 'I') {
					x++;
				} else {
					x--;
				}
				max = x > max ? x : max;
			}

			System.out.println(max);

		} finally {
			sc.close();
		}
	}
}