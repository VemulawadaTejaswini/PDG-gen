
import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
	Scanner sc;

	int j(int n, int m, int k) {
		int x = -1;
		for (int i = n - k + 1; i <= n; i++) {
			x = (x + m) % i;
		}
		return x;
	}

	void run() {
		for (;;) {
			int n = sc.nextInt();

			int k = sc.nextInt();
			int m = sc.nextInt();

			if ((n | k | m) == 0) {
				break;
			}

			int v = j(n, k, n);

			System.out.println((v +(-k+m +n)+k*n )%n +1);
		}
	}

	Main() {
		sc = new Scanner(System.in);
		try {
			sc = new Scanner(new File(""));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}