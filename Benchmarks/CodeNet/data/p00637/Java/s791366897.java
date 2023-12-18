import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int page[];

		while (true) {
			n = sc.nextInt();
			if (n == 0) {
				break;
			}

			page = new int[n];
			for (int i = 0; i < n; i++) {
				page[i] = sc.nextInt();
			}
			Arrays.sort(page);
			int start = 0;
			String s = "";
			for (int i = 1; i < n; i++) {
				if (page[i] != page[i - 1] + 1) {
					if (start == i - 1) {
						System.out.print(s + page[start]);
						s = " ";
					} else {
						System.out.print(s + page[start] + "-" + page[i - 1]);
						s = " ";
					}
					start = i;
				}
			}
			if (start == n - 1) {
				System.out.print(s + page[start]);
				s = " ";
			} else {
				System.out.print(s + page[start] + "-" + page[n - 1]);
				s = " ";
			}
			
			System.out.println();
		}
	}
}