import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		char topography[] = scanner.nextLine().toCharArray();
		int sum = 0;
		ArrayDeque<Pond> ponds = new ArrayDeque<Pond>();
		ArrayDeque<Integer> li = new ArrayDeque<Integer>();
		for (int i = 0; i < topography.length; i++) {
			if (topography[i] == '\\') {
				li.add(i);
			} else if (!li.isEmpty() && topography[i] == '/') {
				int a = i - li.getLast();
				sum += a;
				while (!ponds.isEmpty() && li.getLast() < ponds.getLast().i) {
					a += ponds.getLast().area;
					ponds.removeLast();
				}
				ponds.add(new Pond(a, li.pollLast()));
			}
		}
		System.out.print(sum + "\n" + ponds.size());
		for (Pond l : ponds) {
			System.out.print(" " + l.area);
		}
		System.out.println();
	}

}

class Pond {
	public int area, i;

	public Pond(int area, int i) {
		this.area = area;
		this.i = i;
	}
}
