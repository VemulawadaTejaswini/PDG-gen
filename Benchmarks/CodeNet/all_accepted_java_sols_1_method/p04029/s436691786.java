import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		int N = scanner.nextInt();

		int ans = N /2 * (1 + N);
		if (N % 2 == 1) {
			ans += (N /2 + 1);
		}

		System.out.println(ans);

		scanner.close();
	}

}
