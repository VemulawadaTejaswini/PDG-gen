import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

class Main {
	public static void main(String[] args)
			throws IOException {

		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		String number = br.readLine();
		String s = br.readLine();
		StringTokenizer st;
		int count = 0;
		ArrayList<String> list = new ArrayList<>();

		while (!(s == null || "".equals(s))) {
			st = new StringTokenizer(s);
			Integer[] tri = new Integer[3];
			tri[0] = Integer.parseInt(st
					.nextToken());
			tri[1] = Integer.parseInt(st
					.nextToken());
			tri[2] = Integer.parseInt(st
					.nextToken());

			Arrays.sort(tri, Collections
					.reverseOrder());

			String yesno = new String();
			yesno = "NO";

			double compare = Math.pow(tri[0], 2)
					- Math.pow(tri[1], 2) - Math
							.pow(tri[2], 2);
			if (compare == 0) {
				yesno = "YES";
			}

			list.add(count++, yesno);
			s = br.readLine();

		}
		for (String string : list) {
			System.out.println(string);
		}

	}

}