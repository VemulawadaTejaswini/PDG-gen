import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			long n = sc.nextInt();
			long k = sc.nextInt();

			long val = 1;
			for (int i = 0; i < n; i++) {
				if (k < val) {
					val += k;
				} else {
					val *= 2;
				}
			}

			System.out.println(val);
		}
	}
}