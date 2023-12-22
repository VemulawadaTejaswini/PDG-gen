import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int K = scanner.nextInt();
		String S = scanner.next();
		String[] sArray = S.split("");
		sArray[K - 1] = sArray[K - 1].toLowerCase();
		System.out.println(String.join("", sArray));
		scanner.close();
	}
}