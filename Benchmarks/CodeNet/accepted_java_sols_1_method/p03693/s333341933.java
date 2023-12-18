import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		String output = "NO";

		Scanner scanner = new Scanner(System.in);

		int r = scanner.nextInt();
		int g = scanner.nextInt();
		int b = scanner.nextInt();


		if((r * 100 + g * 10 + b ) % 4  ==0 )
			output = "YES";

		System.out.println(output);
	}

}
