import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		short input = scanner.nextShort();
		scanner.close();

		if (input < 1200) {
			System.out.print("ABC");
		} else if(input < 2800) {
			System.out.print("ARC");
		} else {
			System.out.print("AGC");
		}
	}
	
}