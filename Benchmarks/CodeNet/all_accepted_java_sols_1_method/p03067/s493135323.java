import java.util.*;
import java.math.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		List<Integer> list = new ArrayList<>();

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int big = Math.max(a,b);
		int min = Math.min(a,b);

		if (big >= c&& min<=c) {
			System.out.println("Yes");
		} else  {
			System.out.println("No");
		}
	}
}