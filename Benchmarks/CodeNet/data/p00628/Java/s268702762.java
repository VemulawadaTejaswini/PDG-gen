import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		while (true) {
			String line = sc.nextLine();
			if (line.equals("END OF INPUT")) break;
			int prev = -1;
			for (int i = 0; i < line.length(); ++i) {
				if (line.charAt(i) == ' ') {
					System.out.print(i - prev - 1);
					prev = i;
				}
			}
			System.out.println(line.length() - prev - 1);
		}
	}
}