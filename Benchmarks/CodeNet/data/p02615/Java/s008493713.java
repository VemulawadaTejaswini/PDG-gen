import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());

		int[] friendly = new int[n];
		long sum = 0;
		for (int i = 0; i < n; i++) {
			friendly[i] = Integer.parseInt(sc.next());
			sum += friendly[i];
		}

		Arrays.sort(friendly);
		sum -= friendly[0];
		System.out.println(sum);
	}

}
