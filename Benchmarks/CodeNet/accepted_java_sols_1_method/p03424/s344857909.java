import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		int nTests = sc.nextInt();
		HashSet<String> h = new HashSet<>();
		for (int i = 0; i < nTests; i++) {
			String c = sc.next();
			if (!h.contains(c))
				h.add(c);
		}

		System.out.println((h.size() == 3) ? "Three" : "Four");
	}
}