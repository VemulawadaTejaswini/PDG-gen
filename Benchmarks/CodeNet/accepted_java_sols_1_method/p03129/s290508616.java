import java.util.*;
import java.math.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		List<Integer> list = new ArrayList<>();

		int n = sc.nextInt();
		int k = sc.nextInt();
		String result = (2*k-1)<=n?"YES":"NO";

		System.out.println(result);

	}
}
