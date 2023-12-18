import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for (int i = 0; i < n; ++i) {
			ArrayList<Integer> l = new ArrayList<Integer>();
			for (int j = 0; j < 3; ++j) {
				l.add(s.nextInt());
			}
			Collections.sort(l);
			System.out.println(Math.pow(l.get(0), 2) + Math.pow(l.get(1), 2) == Math.pow(l.get(2), 2) ? "YES" : "NO");
		}
	}
}