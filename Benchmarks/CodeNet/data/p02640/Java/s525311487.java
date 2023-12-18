import java.util.Scanner;

public class Crane_and_Turtle {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int a[] = new int[2];

		for (int i = 0; i < a.length; i++)
			a[i] = input.nextInt();

		int x = a[0], y = a[1];
		if (!(y >= 2 * x && y <= 4 * x && y%2==0)) {
			System.out.println("No");
			return;
		}

		int crane, turtle;

		crane = ((4 * x) - y) / 2;

		turtle = (y - (2 * x)) / 2;

		if (crane + turtle == a[0])
			System.out.println("Yes");
	}

}
