import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner sci = new Scanner(System.in);
		int n = sc.nextInt();

		String str = sci.nextLine();
		String[] strs = str.split(" ");

		int max = Integer.parseInt(strs[0]);
		int min = max;
		int sum = max;
		int t = 0;

		for (int i = 1; i < n; i++) {
			t = Integer.parseInt(strs[i]);
			if ( max < t ) {
				max = t;
			}
			if ( min > t ) {
				min = t;
			}
			sum += t;
		}

		System.out.printf("%d %d %d", min, max, sum);
		t = 0;
		sc.close();
		sci.close();
		System.exit(0);

	}

}
