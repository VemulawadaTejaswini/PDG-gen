import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		String output;

		Scanner scanner = new Scanner(System.in);

		output = scanner.next();

		System.out.println(output.replace("2017", "2018"));
		scanner.close();

	}

}
