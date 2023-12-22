import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main (String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		Integer[] fig = new Integer[n];

		for(int i = 0; i < n; i++) {
			fig[i] = sc.nextInt();
		}

		int min, max;
		long sum = 0;

		Arrays.sort(fig);
		min = fig[0];

		Arrays.sort(fig, Collections.reverseOrder());
		max = fig[0];

		for(int i = 0; i < fig.length; i++) {
			sum += fig[i];
		}

		System.out.println(min + " " + max + " " + sum);

	}

}



