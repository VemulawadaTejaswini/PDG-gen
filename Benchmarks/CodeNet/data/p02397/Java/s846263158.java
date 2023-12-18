mport java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		for (int i = 1; i < 3000; i++) {
			Scanner sc = new Scanner(System.in);
			String line = sc.nextLine();
			String[] n = line.split(" ");

			Arrays.sort(n);
			int a = Integer.parseInt(n[0]);
			int b = Integer.parseInt(n[1]);
			if (a == 0 && b == 0) {
				break;

			}
			System.out.println(a + " " + b);

		}
	}

}

