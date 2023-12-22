import java.util.*;

/**
 * Main
 */
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int A = sc.nextInt();
		int B = sc.nextInt();
		if (A == B) {
			System.out.println(A + B);
		} else {
			System.out.println(2 * Math.max(A, B) - 1);
		}

		sc.close();
	}
};