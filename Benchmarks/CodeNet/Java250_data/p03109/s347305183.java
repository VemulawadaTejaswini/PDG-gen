import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String S = scanner.next();
		System.out.println(S.compareTo("2019/04/30") <= 0 ? "Heisei" : "TBD");
		scanner.close();
	}
}