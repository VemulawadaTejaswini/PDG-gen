import java.io.UnsupportedEncodingException;
import java.util.*;

public class Main {

	public static void main(String[] args) throws UnsupportedEncodingException {

		Scanner sc = new Scanner(System.in);

		int ans = 0;

		int[] list = new int[3];
		list[0] = sc.nextInt();
		list[1] = sc.nextInt();
		list[2] = sc.nextInt();

		int K = sc.nextInt();

		Arrays.sort(list);

		for (int i = 0; i < K; i++) {
			list[2] = list[2] * 2;

		}

		for (int i : list) {
			ans += i;
		}

		System.out.println(ans);
		sc.close();
	}
}
