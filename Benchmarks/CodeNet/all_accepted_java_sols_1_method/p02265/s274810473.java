import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
		ArrayDeque<Integer> ad = new ArrayDeque<Integer>();
		String l[];
		int n = Integer.parseInt(scanner.readLine());
		for (int i = 0; i < n; i++) {
			l = scanner.readLine().split(" ");
			String c = l[0];
			if (c.equals("insert")) {
				ad.addFirst(Integer.parseInt(l[1]));
			} else if (c.equals("delete")) {
				ad.remove(Integer.parseInt(l[1]));
			} else if (c.equals("deleteFirst")) {
				ad.removeFirst();
			} else if (c.equals("deleteLast")) {
				ad.removeLast();
			}
		}
		System.out.print(ad.poll());
		for (int t : ad) {
			System.out.print(" " + t);
		}
		System.out.println();
	}
}

