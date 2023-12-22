import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try(Scanner scanner = new Scanner(System.in)) {
			String data = scanner.nextLine();

			String[] dataArray = data.split(" ");

			int index = 0;
			for (index = 0; index <= dataArray.length; index++) {
				if (dataArray[index].equals("0")) {
					break;
				}
			}

			System.out.println(index + 1);
		}
	}
}