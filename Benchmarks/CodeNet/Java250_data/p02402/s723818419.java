import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int nn = scan.nextInt();

		int[] aiai;
		aiai = new int[nn];

		long total = 0;
		for (int i = 0; i < nn; i++) {
			aiai[i] = scan.nextInt();
			total = total + aiai[i];
		}

		Arrays.sort(aiai);
		System.out.println(aiai[0] + " " + aiai[nn - 1] + " " + total);

	}

}