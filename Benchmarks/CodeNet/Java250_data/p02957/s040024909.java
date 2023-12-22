import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int ans = 0;

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = sc.nextInt();
//
//		int[] array = new int[n];
//		for (int i = 0; i < n; i++) {
//			array[i] = sc.nextInt();
//		}
		int k = Math.abs(n-d);

		if(k % 2 == 0) {
			if(n < d) {
				System.out.println(n+(k/2));
			} else {
				System.out.println(d+(k/2));
			}
		} else {
			System.out.println("IMPOSSIBLE");
		}

		sc.close();
	}
}
