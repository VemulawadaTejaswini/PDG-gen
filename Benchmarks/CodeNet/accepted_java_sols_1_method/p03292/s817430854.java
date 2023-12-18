
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int[] a = new int[3];
			for (int i = 0; i < 3; i++) {
				a[i] = sc.nextInt();
			}
			Arrays.sort(a);

			System.out.println(a[2] - a[0]);
		}
	}
}
