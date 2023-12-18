import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int a[] = new int[2];

		for (int i = 0; i < a.length; i++)
			a[i] = input.nextInt();

		if (!(a[1] >= 2 * a[0] && a[1] <= 4 * a[0] && a[1]%2==0)) {
			System.out.println("No");
			return;
		}
		int crane = ((4 * a[0]) - a[1]) / 2;
		int turtle = (a[1] - (2 * a[0])) / 2;
		if (crane + turtle == a[0])
			System.out.println("Yes");
	}

}
