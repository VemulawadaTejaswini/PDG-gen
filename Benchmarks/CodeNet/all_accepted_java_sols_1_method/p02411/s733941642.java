import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int i = 1;
		while (i < 1000) {
			String line = sc.nextLine();
			String[] string = line.split(" ");
			int m = Integer.parseInt(string[0]);
			int f = Integer.parseInt(string[1]);
			int r = Integer.parseInt(string[2]);

			if (m == -1 && f == -1 && r == -1) {
				break;

			} else if (m == -1 || f == -1 || m + f < 30) {
				System.out.println("F");

			} else if (m + f >= 80) {
				System.out.println("A");

			} else if (m + f >= 65 && m + f < 80) {
				System.out.println("B");

			} else if (m + f >= 50 && m + f < 65) {
				System.out.println("C");

			} else if (m + f >= 30 && m + f < 50 && r >= 50) {
				System.out.println("C");

			} else if (m + f >= 30 && m + f < 50) {
				System.out.println("D");

			}
			i++;
		}

	}
}