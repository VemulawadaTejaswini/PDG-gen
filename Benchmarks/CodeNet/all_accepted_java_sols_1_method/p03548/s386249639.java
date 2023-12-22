import java.util.Scanner;
import java.util.Arrays;

public class Main {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int X = s.nextInt();
		int Y = s.nextInt();
		int Z = s.nextInt();
		int count = 0;

		while (X >= Y+2*Z) {
			X = X - Y - Z;
			if (0 <= X) {
				count++;
			}
		}
		System.out.println(count);
	}

}