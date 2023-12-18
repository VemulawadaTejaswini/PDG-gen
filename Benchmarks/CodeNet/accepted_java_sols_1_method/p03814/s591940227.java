import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = new String(scanner.next());
		Integer output = input.lastIndexOf('Z') - input.indexOf('A') + 1 ;
		System.out.println(output);
		scanner.close();
	}
}
