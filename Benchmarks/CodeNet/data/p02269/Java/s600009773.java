
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(
			new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		HashSet<String> h = new HashSet<String>();
		for (int i = 0; i < n; i++) {
			String l[] = br.readLine().split(" ");
			switch (l[0]) {
				case "insert": h.add(l[1]); break;
				case "find":
				if (h.contains(l[1])) System.out.println("yes");
				else System.out.println("no");
				break;
			}
		}
	}
}