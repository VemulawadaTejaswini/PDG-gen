
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		sc.close();

		int x=700;
		for(char c: line.toCharArray()) {
			if (c == 'o') x += 100;
		}
		System.out.println(x);
	}
}
