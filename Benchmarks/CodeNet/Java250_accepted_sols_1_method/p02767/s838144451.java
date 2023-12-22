import java.util.Scanner;

public final class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt();
			int[] positions = new int[n];

			int maxPosition = 0;
			for (int i = 0; i < n; i++) {
				int p = scanner.nextInt();
				positions[i] = p;
				if (p > maxPosition) {
					maxPosition = p;
				}
			}

			int minEnergy = Integer.MAX_VALUE;
			for (int p = 0; p <= maxPosition; p++) {
				int energy = 0;
				for (int i = 0; i < positions.length; i++) {
					energy += (int) Math.pow(positions[i] - p, 2);
				}
				if (energy < minEnergy) {
					minEnergy = energy;
				}
			}

			System.out.println(minEnergy);
		}
	}

}
