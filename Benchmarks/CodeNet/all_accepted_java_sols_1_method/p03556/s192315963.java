import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		for (int i = 1; i < 100000; i++) {
			if (n < i * i) {
				System.out.println((i - 1) * (i - 1));
				return;
			}
		}
	}
}