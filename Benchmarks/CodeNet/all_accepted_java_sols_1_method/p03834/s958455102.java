import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
       		String inputString = scanner.nextLine();
		inputString = inputString.replace(",", " ");
		System.out.println(inputString);
	}
}