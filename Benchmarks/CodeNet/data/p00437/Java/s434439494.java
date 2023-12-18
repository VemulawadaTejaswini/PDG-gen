import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner scan = new Scanner(System.in);
		// Scanner scan = new Scanner(new File("c:\\0509-input.txt"));

		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();

		int n = scan.nextInt();

		int[] part = new int[a + b + c + 1];
		int[][] fail = new int[n][3];

		for (int i = 0, j = 0; i < n; i++) {
			int x = scan.nextInt();
			int y = scan.nextInt();
			int z = scan.nextInt();
			int r = scan.nextInt();
			if (r == 1) {
				part[x] = 1;
				part[y] = 1;
				part[z] = 1;
			} else {
				fail[j][0] = x;
				fail[j][1] = y;
				fail[j][2] = z;
				j++;
			}
		}
		for (int i = 0; i < n && fail[i][0] > 0; i++)
			if (part[fail[i][0]] + part[fail[i][1]] + part[fail[i][2]] == 2) {
				if (part[fail[i][0]] == 0)
					part[fail[i][0]] = -1;
				if (part[fail[i][1]] == 0)
					part[fail[i][1]] = -1;
				if (part[fail[i][2]] == 0)
					part[fail[i][2]] = -1;
			}
		for (int i = 1; i < part.length; i++)
			if (part[i] == 1)
				System.out.println(1);
			else if (part[i] == 0)
				System.out.println(2);
			else
				System.out.println(0);

		scan.close();
		System.exit(0);
	}

}