import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int p;
		int count = 0;

		for (int i = 1; i < n+1; i++) {
			p = sc.nextInt();
			if (p != i) {
				count++;
				if (count > 2) {
					System.out.println("NO");
					return;
				}
			}
		}
		System.out.println("YES");
	}
}
