import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner scan = new Scanner(System.in);
		// Scanner scan = new Scanner(new File("c:\\0509-input.txt"));

		int[] s = new int[2];
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 4; j++) {
				int x = scan.nextInt();
				s[i] += x;
			}
		}
		int max = -1;
		for (int i = 0; i < 2; i++)
			if (s[i] > max)
				max = s[i];

		System.out.println(max);

		scan.close();
		System.exit(0);
	}
}