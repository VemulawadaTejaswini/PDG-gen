
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long N = in.nextLong();
		long A = in.nextLong();
		long B = in.nextLong();
		if ((B - A) % 2 == 0) {
			System.out.println((B - A) / 2);
		} else {
			if ((A - 1) < (N - B)) {
				long diff = A - 1 + 1;
				System.out.println(diff + (B - diff) / 2);
			} else {
				long diff = N - B + 1;
				System.out.println(diff + ((N - (A + diff)) / 2));
			}
		}
		in.close();
	}
}