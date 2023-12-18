import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try(Scanner scanner = new Scanner(System.in)) {
			String data = scanner.nextLine();
			String[] arr = data.split(" ");
			long a = Long.parseLong(arr[0]);
			long b = Long.parseLong(arr[1]);
			long c = Long.parseLong(arr[2]);
			long d = Long.parseLong(arr[3]);

			long x = Math.max(a, b);
			long y = Math.max(c, d);

			if ((x < 0 && 0 < y) || (0 < x && y < 0)) {
				if (0 < x) {
					x = Math.min(a, b);
				} else {
					y = Math.min(c, d);
				}
			} else if (x == 0 || y == 0) {
				if (x == 0 && y == 0) {
					x = Math.min(a, b);
					y = Math.min(c, d);
				} else if (x == 0) {
					x = Math.min(a, b);
				} else {
					y = Math.min(c, d);
				}
			}

			System.out.println(x * y);
		}
	}
}