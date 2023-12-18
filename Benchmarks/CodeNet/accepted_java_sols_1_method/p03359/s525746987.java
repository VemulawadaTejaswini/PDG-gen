import java.io.UnsupportedEncodingException;
import java.util.*;

public class Main {

	public static void main(String[] args) throws UnsupportedEncodingException {

		Scanner sc = new Scanner(System.in);

		int ans = 0;

		int a = sc.nextInt();
		int b = sc.nextInt();

		if (a <= b) {
			ans = a;
		} else {
			ans = a - 1;
		}

		System.out.println(ans);
		sc.close();
	}
}
