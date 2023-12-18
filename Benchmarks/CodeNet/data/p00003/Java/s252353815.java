import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n = sc.nextInt();
		ArrayList<Integer> side = new ArrayList<Integer>();

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < 3; j++) {
					side.add(sc.nextInt());
				}
				judgeRightTri(side);
				side.clear();
			}
	}

	private static void judgeRightTri(ArrayList<Integer> side) {
		Collections.sort(side, Comparator.reverseOrder());

				if ( Math.pow(side.get(0), 2) == Math.pow(side.get(1), 2) + Math.pow(side.get(2), 2) ) {
					System.out.println("YES");
				} else {
					System.out.println("NO");
				}
	}

}
