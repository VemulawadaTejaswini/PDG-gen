import java.io.IOException;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		int sizeOfList = sc.nextInt();
		int firstValue = sc.nextInt();
		int lowest = firstValue;
		int highest = firstValue;
		int prev = firstValue;
		List<Integer> diffs = new ArrayList<Integer>();

		for (int i = 0; i < sizeOfList - 1; i++) {
			int current = sc.nextInt();
			if (prev > current) {
				// push
				diffs.add(highest - lowest);
				// reset
				lowest = current;
				highest  = current;
			}

			if (current < lowest) {
				// make sure the
				lowest = current;
			}
			if (highest < current) {
				highest= current;
			}
			prev = current;
		}
		//push last diff;
		diffs.add(highest - lowest);
		// search biggest
		Collections.sort(diffs);
		System.out.println(diffs.get(diffs.size()-1));
		/*
		for(int x: diffs) {
			System.out.println("debug:" + x);
		}
		*/
	}
}