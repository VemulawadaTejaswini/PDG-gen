import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long p = 1;
		long tooBig = 1000000000000000000L;
		int n = Integer.parseInt(sc.nextLine());
		String nextLine = sc.nextLine();
		nextLine.trim();
		String[] numbers = nextLine.split(" ");

		for (int i = 0; i < n; i++) {
			p *= Long.parseLong(numbers[i]);
			if (p > tooBig || p < 0) {
				System.out.println("-1");
				return;
			}
		}

		System.out.println(p);
	}
}
