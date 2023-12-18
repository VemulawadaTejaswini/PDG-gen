import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int MAX = 3000;
		String[] output = new String[MAX];
		int count = 0;

		for (int i = 1; i < MAX; i++) {

			String line = sc.nextLine();
			String[] n = line.split(" ");
			Arrays.sort(n);
			if (n[0] .equals ("0") && n[1] .equals ("0")) {
				break;

			}
			count++;
			output[i] = n[0] + " " + n[1];

		}
		for (int i = 1; i <= count; i++) {
			System.out.println(output[i]);

		}

	}

}

