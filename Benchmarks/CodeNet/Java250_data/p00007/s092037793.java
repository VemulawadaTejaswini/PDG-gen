
import java.util.Scanner;

public class Main {


	void run() {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = 100000;

		for(int i = 0; i < n; i++) {
			m += m * 5 / 100;

			int r = m % 1000;
			if(r != 0) {
				m += 1000 - r;
			}
		}

		System.out.println(m);

		sc.close();
	}

	public static void main(String[] args) {
		new Main().run();
	}

}