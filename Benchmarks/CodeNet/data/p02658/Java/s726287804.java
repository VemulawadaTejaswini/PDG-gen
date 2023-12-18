
import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		long result = 1;
		long limit = 1000000000000000000L;
		for (int i = 0; i < n; i++) {
			long a = Long.parseLong(sc.next());
			if (result * a <= limit) {
				result = result * a;
			} else {
				System.out.println("-1");
				return;
			}
		}

		System.out.println(result);

	}

}