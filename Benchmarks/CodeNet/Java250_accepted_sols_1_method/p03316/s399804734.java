
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String n = sc.next();
		int N = Integer.parseInt(n);
		int sn[] = new int[n.length()];
		int S = 0;
		sc.close();

		for (int i = 0; i < n.length(); i++) {
			sn[i] = Integer.parseInt(n.substring(i, i + 1));
			S += sn[i];
		}

		if (N % S == 0) {
			System.out.print("Yes");
		} else {
			System.out.print("No");

		}

	}
}