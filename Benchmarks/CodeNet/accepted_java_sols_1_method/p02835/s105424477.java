import java.util.Scanner;

//AtCoder Beginner Contest 147
//A	Blackjack
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A1 = Integer.parseInt(sc.next());
		int A2 = Integer.parseInt(sc.next());
		int A3 = Integer.parseInt(sc.next());
		sc.close();

		if ((A1+A2+A3) >= 22) {
			System.out.println("bust");
		} else {
			System.out.println("win");
		}
	}
}
