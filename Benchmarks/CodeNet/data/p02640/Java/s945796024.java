
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int turtle_num;
		int turu_num;
		int turtle_legs;
		int turu_legs;

		int X, Y;
		X = sc.nextInt();
		Y = sc.nextInt();
		boolean hasKai=false;
		for (turtle_num = 0; turtle_num <= X; turtle_num++) {
			turu_num = X - turtle_num;
			turtle_legs = 4 * turtle_num;
			turu_legs = 2 * turu_num;
			if (turtle_legs + turu_legs == Y) {
				hasKai=true;
				break;
			}
		}
		if(hasKai) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

	}
}
