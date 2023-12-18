import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		long v = 1;

		long max = (long) Math.pow(10, 18);
		while (n > 0) {
			v *= sc.nextLong();
			if (v == 0) {
				break;
			}
			n--;
		}
		if (v > max) {
			v = -1;
		}
		System.out.println(v);
	}
}