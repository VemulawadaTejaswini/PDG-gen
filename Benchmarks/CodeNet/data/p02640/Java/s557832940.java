import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		int X = scanner.nextInt();
		int Y = scanner.nextInt();
		int leg_turtle = 4;
		int leg_crane = 2;

		int turtle = (Y - (leg_crane * X)) / (leg_turtle - leg_crane);
		int crane = X - turtle;

		if ((turtle >= 0 && crane >= 0) && (turtle * 4 ) + (crane * 2) == Y) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

//		System.out.println(turtle);;
//		System.out.println(crane);;

	}

}