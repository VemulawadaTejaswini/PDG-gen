import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = Integer.parseInt(sc.next());
		int b = Integer.parseInt(sc.next());
		//		//int k = Integer.parseInt(sc.next());
		//		int[] x = new int[n];
		//
		//		for (int i = 0; i < n; i++) {
		//			x[i] = Integer.parseInt(sc.next());
		//		}

		System.out.println(Math.max(0, a - (2 * b)));
		sc.close();
	}
}