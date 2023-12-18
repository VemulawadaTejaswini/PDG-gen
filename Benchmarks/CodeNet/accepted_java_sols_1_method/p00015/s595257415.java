import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = "";

		ArrayList<StringBuilder[]> ds = new ArrayList<StringBuilder[]>();
		int n = 0;

		try {
			s = br.readLine();
			n = Integer.parseInt(s);

			for (int i = 0; i < n; i++) {
				StringBuilder[] sb = new StringBuilder[2];

				s = br.readLine();
				sb[0] = new StringBuilder(s);

				s = br.readLine();
				sb[1] = new StringBuilder(s);

				ds.add(sb);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		for (StringBuilder[] sb : ds) {
			StringBuilder sum = new StringBuilder();
			sb[0].reverse();
			sb[1].reverse();
			int len1 = sb[0].length();
			int len2 = sb[1].length();
			int len = (len1 > len2 ? len1 : len2);

			// q: 商, r: 余
			int q, r;
			q = r = 0;
			for (int i = 0; i < len + 1; i++) {

				int n1, n2;
				if (i < len1)
					n1 = Integer.parseInt(String.valueOf(sb[0].charAt(i)));
				else
					n1 = 0;
				if (i < len2)
					n2 = Integer.parseInt(String.valueOf(sb[1].charAt(i)));
				else
					n2 = 0;
				if (i >= len1 && i >= len2 && q == 0) {
					sum.append("");
				} else {
					r = (n1 + n2 + q) % 10;
					sum.append(r);
					q = (n1 + n2 + q) / 10;
				}
			}
			if (sum.length() > 80)
				System.out.println("overflow");
			else
				System.out.println(sum.reverse());
		}
	}
}