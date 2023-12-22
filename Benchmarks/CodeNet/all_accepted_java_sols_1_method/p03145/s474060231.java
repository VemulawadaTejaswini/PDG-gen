import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] sides = new int[3];

		for (int i = 0; i < sides.length; i++) {
			sides[i] = sc.nextInt();
		}

		Arrays.sort(sides);

		System.out.println(sides[0] * sides[1] / 2);

		sc.close();
	}
}

