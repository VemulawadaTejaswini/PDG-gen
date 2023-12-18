import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//ScannerChar
		char b = sc.findInLine(".").charAt(0);
		char ans = 'a';
		switch (b) {
		case 'A':
			ans = 'T';
			break;
		case 'T':
			ans = 'A';
			break;
		case 'C':
			ans = 'G';
			break;
		case 'G':
			ans = 'C';
		}
		System.out.println(ans);
	}

}
