import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

	static final boolean debugMode = false;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = readInt(sc);
		int m = readInt(sc);
		int total = 0;

		List<Integer> a = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			int tmp = readInt(sc);
			total += tmp;
			a.add(tmp);
		}

		a.sort(Comparator.reverseOrder());
		if (a.get(m - 1) >= (double)total / (double)(4 * m)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
	}

	static int readInt(Scanner sc) {
		return Integer.parseInt(sc.next());
	}

	static void log(String s) {
		if (debugMode) {
			System.out.println(s);
		}
		return;
	}
}

class Pair {
	private int x;
	private int y;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Pair() {

	}

	public Pair(int x, int y) {
		this.x = x;
		this.y = y;
	}

}