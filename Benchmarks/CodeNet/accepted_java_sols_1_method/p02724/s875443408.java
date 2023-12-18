import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();

		int uresisa = 0;

		uresisa += 1000 * (x/500);
		x = x - (500 * (x/500));
		uresisa += 5 * (x/5);

		System.out.println(uresisa);
	}
}