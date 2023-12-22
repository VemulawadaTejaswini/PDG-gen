import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] d = new int[3];
		d[0] = scanner.nextInt();
		d[1] = scanner.nextInt();
		d[2] = scanner.nextInt();
		Arrays.parallelSort(d);
		System.out.println(d[0] + d[1]);
	}
}
