import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			String line = sc.nextLine();
			if (line == "-")
				break;
			int m = sc.nextInt();
			int n = line.length();

			for (int i = 0; i < m; i++) {
				int h = sc.nextInt();
				for (int j = 0; j < h; j++) {
					char c = line.charAt(0);
					for (int k = 0; k < n - 1; k++) {
						line = line.replace(line.charAt(k), line.charAt(k + 1));
					}
					line = line.replace(line.charAt(n - 1), c);
				}
			}
			System.out.println();
		}
	}
}