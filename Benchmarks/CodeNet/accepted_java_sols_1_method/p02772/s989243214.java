import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean isOK = true;
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			if (a % 2 == 0 && (a % 3 != 0 && a % 5 != 0)) {
				isOK = false;
			}
		}
		System.out.println(isOK ? "APPROVED" : "DENIED");
	}

}
