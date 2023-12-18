import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);

	void run() {
		int N = sc.nextInt();
		int Q = sc.nextInt();
		String ans = "kogakubu10gokan";
		for (int i = 0; i < N; i++) {
			int year = sc.nextInt();
			String name = sc.next();
			if (Q >= year) {
				ans = name;
			}
		}
		System.out.println(ans);
	}

	public static void main(String[] args) {
		new Main().run();
	}
}