import java.util.*;

public class Main {
	public static void main(String arg[]) {
		Scanner in = new Scanner(System.in);
		for (;;) {
			int m = in.nextInt();
			int f = in.nextInt();
			int r = in.nextInt();
			if (m == -1 && f == -1 && r == -1)
				break;
			if (m == -1 || f == -1) {
				System.out.println("F");
			} else if (m + f >= 80) {
				System.out.println("A");
			} else if (m + f >= 65) {
				System.out.println("B");
			} else if (m + f >= 50) {
				System.out.println("C");
			} else if (m + f >= 30 && r >= 50) {
				System.out.println("C");
			} else if (m + f >= 30) {
				System.out.println("D");
			} else {
				System.out.println("F");
			}
		}
	}
}