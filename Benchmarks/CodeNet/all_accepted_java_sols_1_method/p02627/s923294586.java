import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String letter = scanner.next();
		char a = 'a';
		
		if(letter.equals(letter.toUpperCase()))
			a = 'A';
		System.out.print(a);
	}
}
