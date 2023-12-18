import java.util.Scanner;

public class Main {

	public static int main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = sc.nextLine();
		String[] strs = new String[n];
		strs = str.split(" ");

		int max = Integer.parseInt(strs[0]);
		int min = max;
		int sum = max;

		for (int i = 1; i < n; i++) {
			if ( max < Integer.parseInt(strs[i]) ) {
				max = Integer.parseInt(strs[i]);
			}

			if ( min > Integer.parseInt(strs[i]) ) {
				min = Integer.parseInt(strs[i]);
			}

			sum += Integer.parseInt(strs[i]);
		}

		System.out.printf("%d %d %d\n", max, min, sum);
		sc.close();
		return 0;
	}

}

