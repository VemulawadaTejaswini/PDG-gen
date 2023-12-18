import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int m = scan.nextInt();
		Integer[] a = new Integer[n];

		int sum = 0;


		for(int i = 0;i < n;i++) {
			a[i] = scan.nextInt();

			 sum += a[i];
		}

		Arrays.sort(a,Comparator.reverseOrder());

	double min = (double)sum/(4*m);

		System.out.println(a[m-1] >= min ? "Yes":"No");

		scan.close();

	}

}
