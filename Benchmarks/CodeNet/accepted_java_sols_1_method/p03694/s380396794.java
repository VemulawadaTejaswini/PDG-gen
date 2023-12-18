import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int n = sc.nextInt();
		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		int max = 0;
		for (int num : a) {
			if (max < num) {
				max = num;
			}
		}
		int min = 1000;
		for (int num : a) {
			if (min > num) {
				min = num;
			}
		}

		System.out.println(max - min);

	}
}