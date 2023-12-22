import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		String[] s = { scan.next(), scan.next(), scan.next() };
		int[] index = { 0, 0, 0 };

		int turn = 0;
		char next;
		while (true) {
			if (s[turn].length() == index[turn]) {
				break;
			}
			next = s[turn].charAt(index[turn]);
			index[turn]++;
			switch (next) {
			case 'a':
				turn = 0;
				break;
			case 'b':
				turn = 1;
				break;
			case 'c':
				turn = 2;
				break;
			}
		}
		switch (turn) {
		case 0:
			System.out.println("A");
			break;
		case 1:
			System.out.println("B");
			break;
		case 2:
			System.out.println("C");
			break;
		}
	}
}
