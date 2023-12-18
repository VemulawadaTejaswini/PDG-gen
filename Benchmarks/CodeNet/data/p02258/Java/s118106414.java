import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int min = 1000000000;
		int max = -1000000000;

		for(int i = 0; i < n; i++) {

			int r = sc.nextInt();

			min = Math.min(min, r);
			max = Math.max(max, r - min);

		}

		System.out.println(max);

	}

}
