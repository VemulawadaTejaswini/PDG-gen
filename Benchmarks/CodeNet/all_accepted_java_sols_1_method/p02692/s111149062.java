import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main{

	static int[] dx = new int[] { -1, 0, 1, 0, -1, -1, 1, 1 };
	static int[] dy = new int[] { 0, 1, 0, -1, -1, 1, -1, 1 };
	static int A, B, C;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int[] arr = new int[3];
		arr[0] = a;
		arr[1] = b;
		arr[2] = c;
		String[] str = new String[n];
		for (int i = 0; i < str.length; i++) {
			str[i] = br.readLine();
		}
		boolean f = true;
		int[] ans = new int[n];
		for (int i = 0; i < n; i++) {
			String s = str[i];
			int id1 = s.charAt(0) - 'A';
			int id2 = s.charAt(1) - 'A';
			if (arr[id1] == 0 && arr[id2] == 0) {
				f = false;
			} else if (arr[id1] == 1 && arr[id2] == 1 && i != n - 1) {
				String t = str[i + 1];
				int x = t.charAt(0) - 'A';
				int y = t.charAt(1) - 'A';
				if (id1 == x || id1 == y) {
					arr[id1]++;
					arr[id2]--;
					ans[i] = id1;
				} else {
					arr[id1]--;
					arr[id2]++;
					ans[i] = id2;
				}
			} else if (arr[id1] > arr[id2]) {
				arr[id1]--;
				arr[id2]++;
				ans[i] = id2;
			} else {
				arr[id1]++;
				arr[id2]--;
				ans[i] = id1;
			}
		}
		if (f) {
			pw.println("Yes");
			for (int i = 0; i < ans.length; i++) {
				pw.println((char) ('A' + ans[i]));
			}
		} else
			pw.println("No");
		pw.flush();
	}

}
