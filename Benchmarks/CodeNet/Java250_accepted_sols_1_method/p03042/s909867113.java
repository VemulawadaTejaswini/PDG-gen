import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.next();

		int pre = Integer.valueOf(str.substring(0, 2));
		int bef = Integer.valueOf(str.substring(2, 4));

		if (pre > 12 || pre == 0) {
			if (bef > 12 || bef == 0) {
				System.out.println("NA");
			} else {
				System.out.println("YYMM");
			}
		} else if (bef > 12 || bef == 0) {
			System.out.println("MMYY");
		} else {
			System.out.println("AMBIGUOUS");
		}
	}
}