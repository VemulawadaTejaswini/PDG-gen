import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();

		int pre = Integer.parseInt(S.substring(0, 2));
		int post = Integer.parseInt(S.substring(2));

		if((0 < pre && pre < 13) && (0 < post && post < 13)) {
			System.out.println("AMBIGUOUS");
		} else if (0 < pre && pre < 13) {
			System.out.println("MMYY");
		} else if (0 < post && post < 13) {
			System.out.println("YYMM");
		} else {
			System.out.println("NA");
		}
	}
}