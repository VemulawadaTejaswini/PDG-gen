import java.util.Scanner;

public class Main {

	void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int max = -1;
		int maxix = 21;
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			int v = sc.nextInt();
			if (v > max) {
				max = v;
				maxix = a;
			} else if (v == max && maxix > a) {
				maxix = a;
			}
		}

		System.out.println(maxix + " " + max);
	}

	public static void main(String[] args) {
		new Main().run();
	}

}