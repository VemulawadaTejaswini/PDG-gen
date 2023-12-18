import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int div = 2019;
		long L = Integer.parseInt(sc.next());
		long R = Integer.parseInt(sc.next());
		long l = L / div;
		long r = R / div;
		if (l != r) {
			System.out.println(0);
			sc.close();
			return;
		}
		long diff = -1;
		for (long i = L + 1; i <= R; i++) {
			for (long j = L; j < i; j++) {
				long currentDiff = ((i % div) * (j % div)) % div;
				if (diff == -1) {
					diff = currentDiff;
				} else if (diff > currentDiff) {
					diff = currentDiff;
				}
			}
		}
		System.out.println(diff);
		sc.close();
	}
}
