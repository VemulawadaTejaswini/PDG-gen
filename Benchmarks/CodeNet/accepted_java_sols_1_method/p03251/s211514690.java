import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			int xNum = sc.nextInt();
			int yNum = sc.nextInt();
			int xPositon = sc.nextInt();
			int yPosition = sc.nextInt();

			List<Integer> xPointList = new ArrayList<>();
			// xlist

			int currentXPoint;
			for (int i = 0; i < xNum; i++) {
				currentXPoint = sc.nextInt();
				xPointList.add(currentXPoint);
			}

			List<Integer> yPointList = new ArrayList<>();
			// ylist
			int currentYPoint;
			for (int i = 0; i < yNum; i++) {
				currentYPoint = sc.nextInt();
				yPointList.add(currentYPoint);
			}

			xPointList.add(xPositon);
			yPointList.add(yPosition);
			//max X
			Optional<Integer> optMaxX = xPointList.stream().max((a, b) -> a.compareTo(b));
			int maxX = optMaxX.get();
			//min Y
			Optional<Integer> optMinY = yPointList.stream().min((a, b) -> a.compareTo(b));
			int minY = optMinY.get();

			if (maxX < minY) {
				System.out.println("No War");
			}
			else {
				System.out.println("War");
			}

		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
}
