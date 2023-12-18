
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int[] a = new int[n];
		int sum = 0;

		for(int i = 0; i < n; i++){

			a[i] = in.nextInt();

		}

		int max = a[0];
		int min = a[0];

		for(int i = 0; i < n; i++){

			if(min > a[i]) {

				min = a[i];
			}
		}

		for(int i = 0; i < n; i++){

			if(max < a[i]) {

				max = a[i];
			}
		}

		for(int i = 0; i < n; i++){

			sum += a[i];

		}

		System.out.println(min + " " + max + " " + sum);
	}
}