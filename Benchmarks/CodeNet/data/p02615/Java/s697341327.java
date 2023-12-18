import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Integer a[] = new Integer[n];
		long sum = 0;
		for(int i = 0 ; i < n ; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a , Comparator.reverseOrder());

		for(int i = 1 ; i < n ; i++) {
			sum += a[i / 2];
		}

		System.out.println(sum);
		sc.close();

	}
}

