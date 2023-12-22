import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] a) {
		int[] takasa = new int[10];
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {

			takasa[i] = Integer.valueOf(scan.next());
		}
		Arrays.sort(takasa);
		for (int i = 9; i > 6; i--)
			System.out.println(takasa[i]);
	}

}