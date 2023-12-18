import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		BitSet sb = new BitSet();
		List<Integer> list = new ArrayList<Integer>();
		while (!("0 0".equals(line))) {
			int n = Integer.parseInt(line.substring(0, line.indexOf(' ')));
			int k = Integer.parseInt(line.substring(line.indexOf(' ') + 1));
			sb.clear();
			list.clear();
			for (int i = 0; i < k; i++) {
				sb.set(Integer.parseInt(br.readLine()));
			}
			int sizeMax = 0;
			if (!sb.get(1)) {
				list.add(0);
			}
			int start = sb.nextSetBit(1);
			while (start != -1) {
				final int end = sb.nextClearBit(start);
				list.add(Integer.valueOf(end - start));
				start = sb.nextSetBit(end);
				if (start - end != 1) {
					list.add(Integer.valueOf(0));
				}
			}
			if (sb.get(0)) {
				for (int i = 0; i < list.size() - 1; i++) {
					sizeMax = Math.max(sizeMax, list.get(i) + list.get(i + 1)
							+ 1);
				}
			} else {
				for (int i = 0; i < list.size(); i++) {
					sizeMax = Math.max(sizeMax, list.get(i));
				}
			}
			System.out.println(sizeMax);
			line = br.readLine();
		}
	}

}