import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int c[] = new int[101];
			while (true) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				if ((a | b) == 0) {
					break;

				}
				c[a]++;
				c[b]++;
			}
			int odd = 0;
			boolean flag = true;
			for (int i = 0; i < 101; i++) {

				if (c[i] == 0)
					continue;
				if (c[i] % 2 != 0) {
					odd++;
					if (odd > 2) {
						flag = false;
						break;
					}
				}
			}
			if (odd!=2)flag = false;
			System.out.println(flag ? "OK" : "NG");
		}
	}
}