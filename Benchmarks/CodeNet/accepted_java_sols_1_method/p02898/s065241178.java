import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		// ------------------------------------------------
		int n = Integer.parseInt(sc.next());
		int k = Integer.parseInt(sc.next());
		List<Integer> h = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			h.add(Integer.parseInt(sc.next()));
		}

		int ret = 0;
		for (int i = 0; i < n; i++) {
			if (h.get(i) >= k) {
				ret++;
			}
		}
		out.println(ret);

		// ------------------------------------------------
		sc.close();
		out.flush();
	}
}