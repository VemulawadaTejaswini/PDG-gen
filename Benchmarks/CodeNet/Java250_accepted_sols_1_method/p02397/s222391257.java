import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);		

		List<Integer> x = new ArrayList<Integer>();
		List<Integer> y = new ArrayList<Integer>();

		for (;;) {
			int xNum = scan.nextInt();
			int yNum = scan.nextInt();
			if (xNum == 0&& yNum == 0) {
				break;
			}
			x.add(xNum);
			y.add(yNum);
		}

		for (int i = 0; i < x.size(); i++) {
			System.out.println(x.get(i) < y.get(i) ? x.get(i) + " " + y.get(i) : y.get(i) + " " + x.get(i));
		}
		scan.close();

	}

}