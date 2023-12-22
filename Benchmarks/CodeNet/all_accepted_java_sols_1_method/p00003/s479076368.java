import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] sides = new int[3];
		for (int i = 0; i < n; i++) {
			sides[0] = scanner.nextInt();
			sides[1] = scanner.nextInt();
			sides[2] = scanner.nextInt();
			Arrays.sort(sides);
			System.out.println(
				sides[0] * sides[0] + sides[1] * sides[1] == sides[2] * sides[2] ?
				"YES" : "NO"
				);
		}
	}
}