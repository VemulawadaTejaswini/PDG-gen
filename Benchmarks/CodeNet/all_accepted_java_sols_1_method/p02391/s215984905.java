import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		String out;
		
		if (a > b) {
			out = "a > b";
		} else if (a < b) {
			out = "a < b";
		} else {
			out = "a == b";
		}
		System.out.println(out);
	}	
}