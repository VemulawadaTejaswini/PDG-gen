
//import java.util.Scanner;
//
//public class Main {
//	public static void main(String[] args) {
//
//		Scanner sc = new Scanner(System.in);
//
//		String s = sc.next();
//
//		System.out.println(s.equals("Sunny") ? "Cloudy" : s.equals("Cloudy") ? "Rainy" : "Sunny");
//
//	}
//}

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();
		int q = sc.nextInt();

		int[] point = new int[n];

		Arrays.fill(point, k - q);

		for (int i = 0; i < q; i++) {
			point[sc.nextInt() - 1]++;
		}

		for (int ans : point) {
			if (ans <= 0) {
				System.out.println("No");
			} else {
				System.out.println("Yes");
			}
		}

	}
}