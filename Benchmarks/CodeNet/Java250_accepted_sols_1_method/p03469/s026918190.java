import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			String line = scanner.nextLine();
			System.out.println("2018/01/" + line.split("/")[2]);
		}
	}
}
