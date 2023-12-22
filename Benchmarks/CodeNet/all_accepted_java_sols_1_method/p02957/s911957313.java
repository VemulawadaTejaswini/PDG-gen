import java.util.Scanner;

//AtCoder Beginner Contest 135
//A	Harmony
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = new Long(sc.next());
		long B = new Long(sc.next());
		sc.close();

		if ((A + B) % 2 == 0) {
			System.out.println((A + B) / 2);
		} else {
			System.out.println("IMPOSSIBLE");
		}
	}
}
