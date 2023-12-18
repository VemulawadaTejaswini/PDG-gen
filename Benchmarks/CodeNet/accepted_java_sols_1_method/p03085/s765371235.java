import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		char c = input.charAt(0);
		char out;

		switch (c) {
		case 'A':
			out = 'T';
			break;
		case 'C':
			out = 'G';
			break;
		case 'G':
			out = 'C';
			break;
		case 'T':
			out = 'A';
			break;

		default:
			out = '?';
			break;
		}

		System.out.println(out);
		
		sc.close();
	}
}
