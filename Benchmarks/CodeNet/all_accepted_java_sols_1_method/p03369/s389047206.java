import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			String input = scanner.nextLine();
			System.out.print(700 + input.replace("x", "").length() * 100);
		} catch(Exception e) {
			e.printStackTrace();
		}finally {
			scanner.close();
		}
	}
}