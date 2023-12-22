
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String arg[]) {

		Scanner sc = new Scanner(System.in);

		int a[] = new int[3];
		int min = 0;

		for (int i = 0; i < 3; i++) {
			a[i] = sc.nextInt();
		}

		sc.close();

		Arrays.sort(a);

		min = a[1] - a[0];
		min += a[2] - a[1];

		System.out.print(min);

	}
}
