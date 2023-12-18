import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		for (int i = 1; i <= 3000; i++) {
			String line = sc.nextLine();
			String[] string = line.split(" ");

			int[] is = new int[2];
			for (int j = 0; j < is.length; j++) {
				is[i] = Integer.parseInt(string[i]);
			}

			Arrays.sort(is);

			System.out.println(is[0] + " " + is[1]);

			if (is[0] == 0 && is[1] == 0) {
				break;
			}
		}

	}

}