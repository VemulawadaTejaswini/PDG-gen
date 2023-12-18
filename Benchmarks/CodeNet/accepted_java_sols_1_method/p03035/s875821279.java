import java.util.*;
import java.math.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		List<Integer> list = new ArrayList<>();

		int a = sc.nextInt();
		int b = sc.nextInt();

		if (a >= 13) {
			System.out.println(b);
		} else if (a <= 5) {
			System.out.println(0);

		} else {
			System.out.println(b / 2);

		}
	}
}
