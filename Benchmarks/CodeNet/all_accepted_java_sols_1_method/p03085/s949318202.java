import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char tmp = sc.next().charAt(0);
		switch (tmp) {
			case 'A':
				System.out.println('T');
				break;
			case 'T':
				System.out.println('A');
				break;
			case 'C':
				System.out.println('G');
				break;
			case 'G':
				System.out.println('C');
				break;
		}
	}
}
