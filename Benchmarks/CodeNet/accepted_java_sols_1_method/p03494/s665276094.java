import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] boads = new int[N];
		boolean allEven = true;

		for (int i = 0; i < N; i++) {
			boads[i] = sc.nextInt();
			if (boads[i] %2 != 0) {
				allEven = false;
			}
		}

		if (!allEven) {
			System.out.println(0);
		} else {
			for (int devideCount = 1; devideCount < boads[0]; devideCount++) {
				for (int boad : boads) {
					int result = boad;
					for (int j = 0; j < devideCount; j++) {
						result = result /2;
					}
					if (result%2 != 0) {
						System.out.println(devideCount);
						allEven = false;
						break;
					}
				}
				if (!allEven) {
					break;
				}

			}

		}

	}
}
