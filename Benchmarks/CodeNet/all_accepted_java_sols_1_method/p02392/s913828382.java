import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		String out = "No";
		
		if (a < b && a < c && b < c) {
			out = "Yes";
		}
		System.out.println(out);
	}	
}