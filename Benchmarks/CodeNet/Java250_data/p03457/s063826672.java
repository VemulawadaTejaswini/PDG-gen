import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());

		List<List<Integer>> points = new ArrayList<>();
		List<Integer> start = new ArrayList<>();
		start.add(0);
		start.add(0);
		start.add(0);
		points.add(start);
		for (int i = 0; i < n; i++) {
			List<Integer> point = new ArrayList<>();
			String[] txy = scanner.nextLine().split(" ");
			point.add(Integer.parseInt(txy[0]));
			point.add(Integer.parseInt(txy[1]));
			point.add(Integer.parseInt(txy[2]));
			points.add(point);
		}

		for (int i = 1; i < n + 1; i++) {
			List<Integer> current = points.get(i - 1);
			List<Integer> target = points.get(i);
			int manhattan = manhattanDist(current.get(1), current.get(2), target.get(1), target.get(2));
			int seconds = target.get(0) - current.get(0);

			if (manhattan > seconds) {
				System.out.println("No");
				System.exit(0);
			}
			if ((seconds - manhattan) % 2 == 1) {
				System.out.println("No");
				System.exit(0);
			}
		}
		System.out.println("Yes");
	}

	public static int manhattanDist(int currentX, int currentY, int targetX, int targetY) {
		return Math.abs(targetX - currentX) + Math.abs(targetY - currentY);
	}
}