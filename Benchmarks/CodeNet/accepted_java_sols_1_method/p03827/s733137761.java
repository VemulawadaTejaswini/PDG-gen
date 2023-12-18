import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		String b = s.next();
		int sum = 0;
		int max = 0;

		int i = 0;

		String ary[] = new String[n];

		for (i = 0; i < n; i++) {
			ary[i] = b.charAt(i) + "";

		}

		i = 0;
		for (i = 0; i < b.length(); i++) {
			if (ary[i].equals("I")) {
				sum = sum + 1;
			} else if (ary[i].equals("D")) {
				sum = sum - 1;
			}

			if (max > sum) {
				max = max;
			} else if (max <= sum) {
				max = sum;
			}

		}
		System.out.println(max);

	}

}