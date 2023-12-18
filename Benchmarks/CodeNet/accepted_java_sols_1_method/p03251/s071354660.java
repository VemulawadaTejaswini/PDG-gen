import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numX = Integer.parseInt(scanner.next());
		int numY = Integer.parseInt(scanner.next());
		int X = Integer.parseInt(scanner.next());
		int Y = Integer.parseInt(scanner.next());

		Integer[] x = new Integer[numX];
		Integer[] y = new Integer[numY];

		for (int i = 0; i < numX; i++) {
			x[i] = Integer.parseInt(scanner.next());
		}
		for (int i = 0; i < numY; i++) {
			y[i] = Integer.parseInt(scanner.next());
		}

		String isWar = "War";
		for (int z = X + 1; z <= Y; z++) {
			isWar = "No War";
			boolean isContinue = true;
			for (int j = 0; j < numX; j++) {
				if (z <= x[j]) {
					isContinue = false;
					isWar = "War";
					break;
				}
			}
			if (isContinue) {
				for (int i = 0; i < numY; i++) {
					if (z > y[i]) {
						isWar = "War";
						break;
					}
				}
			}
			if (isWar.equals("No War")) {
				break;
			}
		}
		System.out.println(isWar);
	}

}
