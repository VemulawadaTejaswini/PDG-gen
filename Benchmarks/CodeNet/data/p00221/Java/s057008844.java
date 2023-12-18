import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, m;
		int p[];
		int id;
		int num;

		while (true) {
			n = sc.nextInt();
			m = sc.nextInt();
			if ((n | m) == 0) {
				break;
			}

			p = new int[n];
			Arrays.fill(p, 1);
			id = 0;
			num = n;

			for (int i = 1; i <= m; i++) {
				String s = sc.next();
				if (i % 3 == 0 && i % 5 == 0 && !s.equals("FizzBuzz")) {
					p[id] = 0;
					num--;
				} else if (i % 3 == 0 && !s.equals("Fizz")) {
					p[id] = 0;
					num--;
				} else if (i % 5 == 0 && !s.equals("Buzz")) {
					p[id] = 0;
					num--;
				} else if (!s.equals(Integer.toString(i))) {
					p[id] = 0;
					num--;
				}
				if (num == 1) {
					for (int j = i + 1; j <= m; j++) {
						sc.next();
					}
					break;
				}
				id = (id + 1) % n;
				while (p[id] == 0) {
					id = (id + 1) % n;
				}
			}
			
			String s = "";
			for (int i = 0; i < n; i++) {
				if (p[i] == 1) {
					System.out.print(s + (i + 1));
					s = " ";
				}
			}
			System.out.println();
		}
	}
}