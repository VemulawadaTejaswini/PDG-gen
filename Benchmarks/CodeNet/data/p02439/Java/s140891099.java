import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Integer[] v = new Integer[]{ sc.nextInt(), sc.nextInt(), sc.nextInt() };
		Arrays.sort(v, Comparator.naturalOrder());

			System.out.printf("%d %d\n", v[0], v[2]);
		sc.close();
	}
}
