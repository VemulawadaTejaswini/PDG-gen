import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] a) {
		int[] takasa = new int[10];
		for (int i = 0; i < 10; i++) {
			Scanner scan = new Scanner(System.in);
			takasa[i] = Integer.valueOf(scan.next());
		}
		Arrays.sort(takasa);
		for (int i = 9; i > 6; i--)
			System.out.println(takasa[i]);
	}

}