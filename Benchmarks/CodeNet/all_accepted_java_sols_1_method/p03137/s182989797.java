import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		int moveCount= m-n;

		if(moveCount <= 0) {
			System.out.println("0");
			return;
		}

		List<Integer> xList = new ArrayList<Integer>();
		List<Integer> diffList = new ArrayList<Integer>();

		for(int i= 0; i < m; i++) {
			xList.add(sc.nextInt());
		}

		Collections.sort(xList);

		for(int i = 1; i < m; i++) {
			diffList.add(xList.get(i) - xList.get(i-1));
		}

		Collections.sort(diffList);

		int cost = 0;
		for(int i = 0; i < moveCount; i++) {
			cost += diffList.get(i);
		}

		System.out.println(cost);

	}

}
