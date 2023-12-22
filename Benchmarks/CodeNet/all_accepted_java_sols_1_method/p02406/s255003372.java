import java.util.Scanner;

public class Main {
	public static void main(String[] arges) {

		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		int v = Integer.parseInt(line);

		for (int i = 1; i <= v; i++) {
			if (i % 3 == 0) {
				System.out.print(" " + i);
			}
			else if (String.valueOf(i).contains("3")) {
				System.out.print(" " + i);
			}
		}
		System.out.println("");
	}
}