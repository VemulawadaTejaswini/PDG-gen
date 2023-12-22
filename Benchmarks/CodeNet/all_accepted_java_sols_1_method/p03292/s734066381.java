import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[3];
		for (int i = 0; i < 3; i++) {
			a[i] = Integer.parseInt(sc.next());
		}
		Arrays.sort(a);

		int cost = 0;
		for (int i = 0; i < 3; i++) {
			if (i != 0) {
				cost += a[i] - a[i - 1];
			}
		}

		System.out.println(cost);

	}

}
