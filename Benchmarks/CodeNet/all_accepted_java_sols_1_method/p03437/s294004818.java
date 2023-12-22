import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int X = scanner.nextInt();
		int Y = scanner.nextInt();
		if (X % Y == 0) {
			System.out.println(-1);
		} else {
			System.out.println(X);
		}
	}
}
