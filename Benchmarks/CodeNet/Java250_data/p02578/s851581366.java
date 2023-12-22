import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();

		long result = 0;
		long num = sc.nextLong();

		for (int i = 1; i < n; i++) {
			long a = sc.nextInt();
			if (a >= num) {
				num = a;
			} else {
				result = result + num - a;
			}
		}

		System.out.println(result);

	}

}
