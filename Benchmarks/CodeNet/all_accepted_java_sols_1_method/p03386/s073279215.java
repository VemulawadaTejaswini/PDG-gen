import java.util.*;

public class Main {

	public static void main(String[] args) {

		// A 以上 B 以下の整数の中で、小さい方から K 番目以内であるか、大きい方から K 番目以内である
		Scanner sc = new Scanner(System.in);

		// 1≤A≤B≤109
		// 1≤K≤100
		int A = sc.nextInt();
		int B = sc.nextInt();
		int K = sc.nextInt();

		int i;
		for (i = A; i < A + K && i <= B; i++) {
			System.out.println(i);
		}

		int t = B - K + 1;
		if (i >= t) {
			t = i;
		}
		for (i = t; i <= B; i++) {
			System.out.println(i);
		}

	}
}
