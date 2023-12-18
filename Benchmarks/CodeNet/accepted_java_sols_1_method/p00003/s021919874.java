import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for (int n = 0 ; n < N ; n++) {
			List<Integer> sides = new ArrayList<Integer>();
			sides.add(sc.nextInt());
			sides.add(sc.nextInt());
			sides.add(sc.nextInt());
			Collections.sort(sides);
			int a = sides.get(0), b = sides.get(1), c = sides.get(2);
			if (c*c == (a*a + b*b))
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}