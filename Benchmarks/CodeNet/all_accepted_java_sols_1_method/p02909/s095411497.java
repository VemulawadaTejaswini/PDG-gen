import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scanner = new Scanner(System.in);

		//入力表示
		String S = scanner.next();

		switch (S) {
		case "Sunny":
			System.out.println("Cloudy");
			break;
		case "Rainy":
			System.out.println("Sunny");
			break;
		case "Cloudy":
			System.out.println("Rainy");
			break;
		}
	}
}
