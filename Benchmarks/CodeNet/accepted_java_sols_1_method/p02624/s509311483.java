
import java.util.*;

public class Main {

	public static void main(String[] args) {

		// 入力
		Scanner sc = new Scanner(System.in);
		long n = new Integer(Integer.parseInt(sc.next()));

		long result = 0;
		for (long i = 1; i <= n; i++) {
			long kosuu = n / i;
			result += (i + (i * kosuu)) * kosuu / 2;
		}

		System.out.println(result);

	}
}
