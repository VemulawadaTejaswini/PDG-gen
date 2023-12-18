import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int AliceP = sc.nextInt();
		int BoliceP = sc.nextInt();
		int dis = BoliceP - AliceP;

		if (dis % 2 == 0) {
			System.out.println("Alice");
		} else {
			System.out.println("Borys");
		}
	}
}
