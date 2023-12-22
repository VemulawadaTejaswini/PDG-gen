import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		char b = sc.next().charAt(0);

		if( b == 'A' || b == 'T') {
			System.out.println(b == 'A' ? 'T' : 'A');
		} else {
			System.out.println(b == 'G' ? 'C' : 'G');
		}
	}
}
