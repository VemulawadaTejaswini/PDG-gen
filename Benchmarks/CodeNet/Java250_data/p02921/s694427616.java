import java.math.BigInteger;
import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String[] S = scanner.nextLine().split("");
		String[] T = scanner.nextLine().split("");
		int ans = 0;

		for (int i = 0; i < 3; i++) {
			if (S[i].equals(T[i]))
				ans++;
		}

		System.out.println(ans);

	}

}
