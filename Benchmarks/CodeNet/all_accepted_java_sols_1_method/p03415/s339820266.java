import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			String answer = "";
			for (int i = 0; i < 3; i++) {
				answer += scanner.nextLine().charAt(i);
			}
			System.out.print(answer);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			scanner.close();
		}
	}
}