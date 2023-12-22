import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char[] s = scanner.nextLine().toCharArray();
		
		System.out.println(String.valueOf(s[0])+(s.length-2)+String.valueOf(s[s.length-1]));
		
		
		scanner.close();
	}
}