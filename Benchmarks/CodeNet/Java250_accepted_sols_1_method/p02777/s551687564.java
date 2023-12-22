import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String x = sc.next();
		String y = sc.next();
		int z = sc.nextInt();
		int n = sc.nextInt();
		String v = sc.next();
		if (v.equals(x)) {
			z = z - 1;
			System.out.println(z + " " + n);
		} else if (v.equals(y)) {
			n = n - 1;
			System.out.println(z + " " + n);

		}

	}

}
