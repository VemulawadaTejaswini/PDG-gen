import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		if (N <= 9) {
			System.out.println(N);
		} else if (N <= 99) {
			System.out.println(9);
		} else if (N <= 999) {
			System.out.println(9 + (N - 99));
		} else if (N <= 9999) {
			System.out.println(9 + (999 - 99));
		} else if (N <= 99999) {
			System.out.println(9 + (999 - 99) + (N - 9999));
		} else if (N <= 999999) {
			System.out.println(9 + (999 - 99) + (99999 - 9999));
		}
	}
}
