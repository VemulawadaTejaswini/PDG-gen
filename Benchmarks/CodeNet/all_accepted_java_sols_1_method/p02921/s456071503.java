
import java.util.*;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		String S = in.readLine();
		String T = in.readLine();
		int count = 0;
		for (int i = 0; i < S.length(); ++i) {
			if (S.charAt(i) == T.charAt(i)) {
				++count;
			}
		}
		System.out.println(count);

	}

}
