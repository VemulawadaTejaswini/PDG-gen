import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = Long.parseLong(sc.next());
		int min = Integer.MAX_VALUE;
		for (long a = 1; a <= Math.sqrt(n); a++) {
			if (n % a != 0)
				continue;
			int l = String.valueOf(n / a).length();
			if (l < min)
				min = l;
		}
		System.out.println(min);
	}
}