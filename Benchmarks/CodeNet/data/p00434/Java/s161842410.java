import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner scan = new Scanner(System.in);
		// Scanner scan = new Scanner(new File("c:\\0509-input.txt"));

		int n = 30;
		boolean[] s = new boolean[n];

		while (scan.hasNext()) {
			int id = scan.nextInt();
			s[id - 1] = true;
		}
		
		for (int i = 0; i < n; i++)
			if (!s[i])
				System.out.println(i + 1);

		scan.close();
		System.exit(0);
	}
}