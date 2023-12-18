import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> ret = new ArrayList<Integer>();
		int i;
		for (i = 0; i < 10; i++) {
			ret.add(sc.nextInt());
		}
		Collections.sort(ret);
		Collections.reverse(ret);
		for (i = 0; i < 3; i++) {
			System.out.println(ret.get(i));
		}
	}
}