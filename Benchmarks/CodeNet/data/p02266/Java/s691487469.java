import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char[] arr = sc.nextLine().toCharArray();

		Deque<Integer> posStack = new ArrayDeque<Integer>();
		Deque<Area> areaStack = new ArrayDeque<Area>();

		int tmp_start, tmp_end, tmp_S, sum = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == '\\') {
				posStack.addFirst(i);
			} else if (arr[i] == '/') {
				if (posStack.isEmpty()) {
					continue;
				}

				tmp_start = posStack.removeFirst();
				tmp_end = i;

				tmp_S = tmp_end - tmp_start;
				sum += tmp_S;

				while (areaStack.isEmpty() == false && areaStack.getFirst().getStart() > tmp_start
						&& areaStack.getFirst().getEnd() < tmp_end) {
					tmp_S += areaStack.getFirst().getS();
					areaStack.removeFirst();
				}

				areaStack.addFirst(new Area(tmp_start, tmp_end, tmp_S));

			} else {
			}

		}

		System.out.println(sum);

		StringBuilder ans = new StringBuilder();

		ans.append(Integer.toString(areaStack.size()));

		while (!areaStack.isEmpty()) {
			ans.append(" ").append(Integer.toString(areaStack.getLast().getS()));
			areaStack.removeLast();
		}

		System.out.println(ans.toString());

		sc.close();
	}
}

class Area {
	private int start;
	private int end;
	private int S;

	public Area(int start, int end, int S) {
		this.start = start;
		this.end = end;
		this.S = S;
	}

	public int getStart() {
		return this.start;
	}

	public int getEnd() {
		return this.end;
	}

	public int getS() {
		return this.S;
	}
}
