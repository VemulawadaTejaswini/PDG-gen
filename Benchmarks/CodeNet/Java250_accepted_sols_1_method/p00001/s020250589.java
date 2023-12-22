import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Main {
	public static void main(String[] a) {
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		while (in.hasNext()) {
			list.add(in.nextInt());
		}
		Collections.sort(list);
		Collections.reverse(list);
		for (int i = 0; i < 3; i++) {
			System.out.println(list.get(i));
		}
	}
}