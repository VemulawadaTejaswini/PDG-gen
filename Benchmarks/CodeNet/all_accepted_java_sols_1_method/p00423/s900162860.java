import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		while (true) {
			int N = sc.nextInt();
			if (N == 0) break;
			int a = 0;
			int b = 0;
			for (int i = 0; i < N; ++i) {
				int ac = sc.nextInt();
				int bc = sc.nextInt();
				if (ac < bc) {
					b += ac + bc;
				} else if (ac > bc) {
					a += ac + bc;
				} else {
					a += ac;
					b += bc;
				}
			}
			System.out.println(a + " " + b);
		}
	}

}