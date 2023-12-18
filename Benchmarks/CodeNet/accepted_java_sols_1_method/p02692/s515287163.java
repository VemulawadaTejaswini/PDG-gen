import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int n = Integer.parseInt(sa[0]);
		int a = Integer.parseInt(sa[1]);
		int b = Integer.parseInt(sa[2]);
		int c = Integer.parseInt(sa[3]);
		String[] s = new String[n + 5];
		for (int i = 0; i < n; i++) {
			s[i] = br.readLine();
		}
		br.close();

		List<String> list = new ArrayList<>(n);
		label:
		for (int i = 0; i < n; i++) {
			if (a < 0 || b < 0 || c < 0) {
				System.out.println("No");
				return;
			}
			if ("AB".equals(s[i])) {
				if (a > b) {
					list.add("B");
					a--;
					b++;
				} else if (a < b) {
					list.add("A");
					a++;
					b--;
				} else {
					for (int j = i + 1; j < i + 3; j++) {
						if ("AC".equals(s[j])) {
							list.add("A");
							a++;
							b--;
							continue label;
						}
						if ("BC".equals(s[j])) {
							list.add("B");
							a--;
							b++;
							continue label;
						}
					}
					list.add("B");
					a--;
					b++;
				}
			} else if ("AC".equals(s[i])) {
				if (a > c) {
					list.add("C");
					a--;
					c++;
				} else if (a < c) {
					list.add("A");
					a++;
					c--;
				} else {
					for (int j = i + 1; j < i + 3; j++) {
						if ("AB".equals(s[j])) {
							list.add("A");
							a++;
							c--;
							continue label;
						}
						if ("BC".equals(s[j])) {
							list.add("C");
							a--;
							c++;
							continue label;
						}
					}
					list.add("C");
					a--;
					c++;
				}
			} else {
				if (b > c) {
					list.add("C");
					b--;
					c++;
				} else if (b < c) {
					list.add("B");
					b++;
					c--;
				} else {
					for (int j = i + 1; j < i + 3; j++) {
						if ("AB".equals(s[j])) {
							list.add("B");
							b++;
							c--;
							continue label;
						}
						if ("AC".equals(s[j])) {
							list.add("C");
							b--;
							c++;
							continue label;
						}
					}
					list.add("C");
					b--;
					c++;
				}
			}
		}
		if (a < 0 || b < 0 || c < 0) {
			System.out.println("No");
			return;
		}
		PrintWriter pw = new PrintWriter(System.out);
		pw.println("Yes");
		for (String str : list) {
			pw.println(str);
		}
		pw.flush();
	}
}
