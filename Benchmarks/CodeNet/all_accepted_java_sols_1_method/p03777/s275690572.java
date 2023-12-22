import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char a = sc.next().charAt(0);
		char b = sc.next().charAt(0);

		if (a == 'D') {
			switch(b) {
			case 'H' :
				b = 'D';
				break;
			case 'D' :
				b = 'H';
			}
		}
		System.out.println(b);
	}
}
