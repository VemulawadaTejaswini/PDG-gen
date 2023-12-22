import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			String string = scanner.nextLine();
			if (string.equals("0")) {
				break;
			}
			int sum = 0;
			for(int i=0;i<string.length();i++) {
				sum += string.charAt(i)-48;
			}
			System.out.println(sum);
		}
		scanner.close();
	}
}
