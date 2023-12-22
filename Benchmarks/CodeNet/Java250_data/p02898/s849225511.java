import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());
		int k = Integer.parseInt(sc.next());

		int count = 0;

		for (int i = 0; i < n; i++) {
			if (k <= Integer.parseInt(sc.next())) {
				count++;
			}
		}
		System.out.println(count);
	}
}