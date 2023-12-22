import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int i = 0;
			int digit = 1;
			while (a + b >= digit) {
				i++;
				digit *= 10;
			}
			System.out.println(i);
		}
	}

}