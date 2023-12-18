import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.BitSet;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		BitSet sb = new BitSet();
		while (!("0 0".equals(line))) {
			int k = Integer.parseInt(line.substring(line.indexOf(' ') + 1));
			sb.clear();
			for (int i = 0; i < k; i++) {
				sb.set(Integer.parseInt(br.readLine()));
			}
			int sizeMax = 0;
			int start = sb.nextSetBit(1);
			while (start != -1) {
				final int end = sb.nextClearBit(start);
				sizeMax = Math.max(sizeMax, end - start);
				int nextstart = sb.nextSetBit(end);
				if (sb.get(0) && nextstart - end == 1) {
					sizeMax = Math.max(sizeMax, sb.nextClearBit(nextstart)
							- start);
				}
				start = nextstart;
			}
			System.out.println(sizeMax);
			line = br.readLine();
		}
	}

}