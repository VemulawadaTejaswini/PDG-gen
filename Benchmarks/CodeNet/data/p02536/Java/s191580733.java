import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int shima = scan.nextInt();
		int michi = scan.nextInt();
		int road[] = new int[michi];

		for (int i = 0; i < michi; i++) {
			road[i] = scan.nextInt();
		}
		scan.close();

		System.out.println(shima - 1 - michi);
	}
}