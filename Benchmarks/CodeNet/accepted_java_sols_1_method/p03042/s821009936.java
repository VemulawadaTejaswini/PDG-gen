
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in);) {
			String s = sc.next();
			int a = Integer.parseInt(s.substring(0, 2));
			int b = Integer.parseInt(s.substring(2, 4));
			if (1 <= a && a <= 12 && 1 <= b && b <= 12) {
				System.out.println("AMBIGUOUS");
			} else if (1 <= a && a <= 12) {
				System.out.println("MMYY");
			} else if (1 <= b && b <= 12) {
				System.out.println("YYMM");
			} else {
				System.out.println("NA");
			}
		}

	}
}