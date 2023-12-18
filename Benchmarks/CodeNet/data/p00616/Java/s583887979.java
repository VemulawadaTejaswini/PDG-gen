import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.lang.Integer.compareUnsigned;
import static java.lang.Integer.parseInt;

/**
 * Problem B: Cubes Without Holes
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			int n, h;
			n = parseInt(line.substring(0, line.indexOf(' ')));
			h = parseInt(line.substring(line.indexOf(' ') + 1));
			if ((n | h) == 0) break;

			Map<String, List<int[]>> holes = new HashMap<>();
			int count = 0;

			for (int i = 0; i < h; i++) {
				words = br.readLine().split(" ");

				String c = words[0];
				int a = parseInt(words[1]);
				int b = parseInt(words[2]);

				holes.putIfAbsent(c, new ArrayList<>());
				holes.get(c).add(new int[]{a, b});

				count += n;
			}

			//xy.xz
			for (int[] xy : holes.get("xy")) {
				for (int[] xz : holes.get("xz")) {
					for (int[] yz : holes.get("yz")) {
						if (xy[0] == xz[0] && xy[1] == yz[0] && (xz[1] == yz[1])) {
							count -= 0;
						} else if (xy[0] == xz[0]) {
							count--;
						} else if (xz[1] == yz[1]) {
							count--;
						} else if (yz[0] == xy[1]) {
							count--;
						}
					}
				}
			}

			System.out.println((n * n * n) - count);

		}
	}
}