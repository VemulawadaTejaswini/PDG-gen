import java.util.*;

/**
 * Main
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int X = sc.nextInt();
		String ans;
		if (X >= 30) {
			ans = "Yes";
		} else {
			ans = "No";
		}

		System.out.println(ans);
		sc.close();
	}
};