import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		long v = 1;

		long zhogen = (long) Math.pow(10, 18);
		while (n > 0) {
			v *= sc.nextLong();
			n--;
		}
		if (v > zhogen) {
			v = -1;
		}
		System.out.println(v);
	}
}