import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			long h = sc.nextLong();

			long cnt = 0;
			long r = 1;
			while (h > 0) {
				h /= 2;
				cnt = cnt + r;
				r *= 2;
			}
			System.out.println(cnt);
		}
	}
}
