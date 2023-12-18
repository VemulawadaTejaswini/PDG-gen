import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		Integer[] a = new Integer[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a, Comparator.reverseOrder());

		int Alice = 0;
		int Bob = 0;
		int turn = 1;
		for (int i = 0; i < a.length; i++) {
			if (turn > 0) {
				Alice += a[i];
			} else {
				Bob += a[i];
			}
			turn *= -1;
		}

		System.out.println(Alice - Bob);

		sc.close();
	}
}
