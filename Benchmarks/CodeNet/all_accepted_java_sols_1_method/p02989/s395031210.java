import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		int[] d = new int[N];
		for(int i = 0; i < N; i++) {
			d[i] = scan.nextInt();
		}

		Arrays.sort(d);

		System.out.println(d[N / 2]  - d[N / 2 - 1]);
	}
}