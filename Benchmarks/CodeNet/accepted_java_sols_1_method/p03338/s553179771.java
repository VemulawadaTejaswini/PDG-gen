
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			String s = sc.next();
			int max = 0;

			for (int i = 1; i < n; i++) {
				String head = s.substring(0, i);
				String tail = s.substring(i, s.length());
				int count = 0;

				for (char c = 'a'; c <= 'z'; c++) {
					if (-1 < head.indexOf(c) && -1 < tail.indexOf(c)) {
						count++;
					}
				}
				if (max < count) {
					max = count;
				}
			}
			System.out.println(max);
		}
	}
}
