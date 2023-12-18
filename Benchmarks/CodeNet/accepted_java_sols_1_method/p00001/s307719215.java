import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ArrayList<Integer> h = new ArrayList<Integer>();
		for (int i = 0; i < 10; ++i) {
			h.add(s.nextInt());
		}
		Collections.sort(h);
		Collections.reverse(h);
		for (int i = 0; i < 3; ++i) {
			System.out.println(h.get(i));
		}
	}
}