import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int input = scanner.nextInt();
		
		String str = new Integer(n).toString(n, input);
		System.out.println(str.length());
	}	
	
}