import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = Integer.parseInt(sc.next());
		int Y = Integer.parseInt(sc.next());
		sc.close();

		if(4 * X < Y) {
			System.out.println("No");
		}else {
			int turtle = (Y - 2 * X) / 2;
			if((Y - 2 * X) % 2 == 0 && turtle >= 0) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		}

	}

}