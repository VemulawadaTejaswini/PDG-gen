import java.util.Scanner;

public class Main {
	static final int a = 100;
	static final double r = 1.01;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long x = Long.parseLong(sc.next());
		System.out.println(solve(x));
	}

	static public int solve(long x) {
		int year = 0;
		for (long i = a;; i = (long) (i * r), year++) {
			if (i >= x)
				return year;
		}
	}

}
