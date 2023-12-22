import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int a[] = { 0, 0, 0 };
		Scanner scan = new Scanner(System.in);
		a[0] = scan.nextInt();
		a[1] = scan.nextInt();
		a[2] = scan.nextInt();

		Arrays.sort(a);
		System.out.printf("%d %d %d\n", a[0], a[1], a[2]);
	}

}

