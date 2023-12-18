import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		String N = in.readLine();
		String subA = N.substring(0, 3);
		String subB = N.substring(1, 4);
		boolean condA = true;
		boolean condB = true;
		for (int i = 1; i < subA.length(); ++i) {
			if (subA.charAt(i - 1) != subA.charAt(i)) {
				condA = false;
				break;
			}
		}
		for (int i = 1; i < subB.length(); ++i) {
			if (subB.charAt(i - 1) != subB.charAt(i)) {
				condB = false;
				break;
			}
		}
		if (condA || condB) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}
}
