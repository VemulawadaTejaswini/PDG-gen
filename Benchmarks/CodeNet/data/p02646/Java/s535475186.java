import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int v = sc.nextInt();
		int b = sc.nextInt();
		int w = sc.nextInt();
		int t = sc.nextInt();

		outside: if (a < b) {
			for (int i = 0; i < t; i++) {
				b += w;
				for (int j = 0; j < v; j++) {
					a += 1;
					if (a == b) {
						break outside;
					}
				}
			}
		} else if (a > b) {
			for (int i = 0; i < t; i++) {
				b -= w;
				for (int j = 0; j < v; j++) {
					a -= 1;
					if (a == b) {
						break outside;
					}
				}
			}
		}

		if (a == b) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

		sc.close();
	}

}