

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<String> list = new ArrayList<String>();

		String numStr = br.readLine();
		long num = Long.valueOf(numStr);

		for (long i = 0; i < num; i++) {
			String str = br.readLine();
			list.add(str);
		}

		for (String str : list) {
			String[] split = str.split(" ");
			long a = Long.valueOf(split[0]);
			long b = Long.valueOf(split[1]);
			long c = Long.valueOf(split[2]);

			ArrayList<Long> edge = new ArrayList<Long>();
			edge.add(a);
			edge.add(b);
			edge.add(c);

			Collections.sort(edge, new Comparator<Long>() {

				@Override
				public int compare(Long o1, Long o2) {
					int ret = 0;
					if (o1 > o2) {
						ret = -1;
					} else if (o1 < 02) {
						ret = 1;
					}
					return ret;
				}
			});
			String out = "";
			long ec = edge.get(0);
			long ea = edge.get(1);
			long eb = edge.get(2);

			if ((ec * ec) == ((ea * ea) + (eb * eb))) {
				out = "YES";
			} else {
				out = "NO";
			}

			System.out.println(out);
		}

	}
}

