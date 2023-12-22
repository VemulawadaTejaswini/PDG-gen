import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long x[] = new long[3];
		long ans = 0;

		for (int i = 0; i < x.length; i++) {
			x[i] = sc.nextInt();
		}


		Arrays.sort(x);



		ans = Math.abs(x[2]/2 - (x[2] - x[2]/2)) * x[1] * x[0];




		System.out.println(ans);
		sc.close();
	}

}