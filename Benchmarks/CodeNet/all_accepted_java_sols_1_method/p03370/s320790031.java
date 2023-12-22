import java.util.*;

public class Main {
	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int sum = 0;
		int min = 1000;
		while (sc.hasNext()) {
			int min2 = sc.nextInt();
			sum = sum + min2;
			if (min2 < min) min = min2;
		}
		System.out.println((x - sum) / min + n);
	}
}
