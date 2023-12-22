import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		for (int i = 1;; i++) {
			if (i * i > n) {
				System.out.println((i - 1) * (i - 1));
				return;
			}
		}
	}
}