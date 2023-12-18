import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		sc.close();

		int X = (int) Math.ceil((double) C / B);
		int Y = (int) Math.ceil((double) A / D);
		if (X <= Y) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
