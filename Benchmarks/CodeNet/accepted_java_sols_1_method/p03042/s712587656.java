import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int first = Integer.parseInt(S.substring(0, 2));
		int second = Integer.parseInt(S.substring(2));
		if (first > 0 && first < 13) {
			if (second > 0 && second < 13) {
				System.out.println("AMBIGUOUS");
			} else {
				System.out.println("MMYY");
			}
		} else {
			if (second > 0 && second < 13) {
				System.out.println("YYMM");
			} else {
				System.out.println("NA");
			}
		}

		sc.close();
	}
}