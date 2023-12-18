import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());

		long[] friendly = new long[n];
		for (int i = 0; i < n; i++)
			friendly[i] = Long.parseLong(sc.next());
		
		long sum = 0;
		Arrays.sort(friendly);
		for (int i = 1; i < n; i++)
			sum += friendly[i];
		
		System.out.println(sum);
	}

}
