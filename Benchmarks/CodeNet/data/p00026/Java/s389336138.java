import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class Main {

	public static void main(String... args) {
		Scanner scanner = null;
		try {
			scanner = new Scanner(System.in);
			
			Paper paper = new Paper();
			while (scanner.hasNext()) {
				String line = scanner.nextLine();
				String[] lines = line.split(",");
				paper.drop(Integer.parseInt(lines[0]),
						Integer.parseInt(lines[1]), Integer.parseInt(lines[2]));
			}
			paper.printOutput();
			
		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}
	
	static class Paper {
		private List<List<Integer>> X_LIST = new ArrayList<List<Integer>>();
		Paper() {
			for (int i = 0; i < 10; i++) {
				List<Integer> yList = new ArrayList<Integer>();
				for (int j  = 0; j < 10; j++) {
					yList.add(0);
				}
				X_LIST.add(yList);
			}
		}
		
		void drop(int x, int y, int size) {
			dropCell(x, y);
			
			switch (size) {
			case 3:
				dropCell(x + 2, y);
				dropCell(x - 2, y);
				dropCell(x, y + 2);
				dropCell(x, y - 2);
			case 2:
				dropCell(x + 1, y + 1);
				dropCell(x + 1, y - 1);
				dropCell(x - 1, y + 1);
				dropCell(x - 1, y - 1);
			case 1:
				dropCell(x + 1, y);
				dropCell(x - 1, y);
				dropCell(x, y + 1);
				dropCell(x, y - 1);
			default:
				break;
			}
		}
		
		void dropCell(int x, int y) {
			if (x < 0 || y < 0 || 9 < x || 9 < y) {
				return;
			}
			List<Integer> yList = X_LIST.get(x);
			yList.set(y, yList.get(y) + 1);
		}
		
		void printOutput() {
			int whiteNum = 0;
			int maxDensity = 0;
			for (List<Integer> yList : X_LIST) {
				for (Integer i : yList) {
					whiteNum = (0 < i) ? whiteNum : whiteNum + 1;
					maxDensity = (maxDensity < i) ? i : maxDensity;
				}
			}
			System.out.println(whiteNum);
			System.out.println(maxDensity);
		}
	}
}