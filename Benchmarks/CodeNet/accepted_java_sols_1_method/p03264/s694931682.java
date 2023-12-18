
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int K = Integer.parseInt(scan.next());
		int Q = K / 2;
		if (K % 2 == 0) {
			System.out.println(Q * Q);
		} else {
			System.out.println(Q * (Q + 1));
		}
	}
}
