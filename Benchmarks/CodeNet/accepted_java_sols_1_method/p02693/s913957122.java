import java.io.*;
import java.util.*;

import static java.lang.System.out;


public final class Main {
	public static void main(String[] args) throws IOException {
		var istr = new InputStreamReader(System.in);
		var br = new BufferedReader(istr);
		int k = Integer.parseInt(br.readLine());
		var st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		for (int score = a; score <= b; score++) {
			if (score % k == 0) {
				out.printf("OK%n");
				return;
			}
		}
		out.printf("NG%n");
	}
}
