import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int a = reader.nextInt();
		int b = reader.nextInt();
		int k = reader.nextInt();
		boolean a_turn = true;

		for (int i = 0; i < k; i++) {
			if (a_turn) {
				if (a % 2 == 1) {
					a--;
				}
				int given = a / 2;
				b+= given;
				a-= given;
			} else {
				if (b % 2 == 1) {
					b--;
				}
				int given = b / 2;
				a+= given;
				b-= given;
			}
			a_turn = !a_turn;
		}
		System.out.println(a + " " + b);
		reader.close();

	}

}
