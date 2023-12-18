import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String a = s.substring(0, 2);
		String b = s.substring(2, 4);
		int ai = Integer.parseInt(a);
		int bi = Integer.parseInt(b);

		if (ai >= 1 && ai <= 12 && bi >= 1 && bi <= 12) {
			System.out.println("AMBIGUOUS");
		} else if (ai >= 1 && ai <= 12) {
			System.out.println("MMYY");
		} else if (bi >= 1 && bi <= 12) {
			System.out.println("YYMM");
		} else {
			System.out.println("NA");
		}
	}
}
