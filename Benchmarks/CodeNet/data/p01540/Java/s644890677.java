import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import static java.lang.Integer.parseInt;

/**
 * Treasure Hunt
 */
public class Main {

	static final int MIN = -1_000_000_001;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		line = br.readLine();

		int n, m;
		n = parseInt(line.substring(0, line.indexOf(' ')));
		m = parseInt(line.substring(line.indexOf(' ') + 1));

		int[][] xy = new int[n + 1][2];
		SortedMap<Integer, Integer> x = new TreeMap<>();
		SortedMap<Integer, Integer> y = new TreeMap<>();

		//xy
		xy[0][0] = MIN;
		xy[0][1] = MIN;
		x.put(MIN, 0);
		y.put(MIN, 0);
		for (int i = 1; i <= n; i++) {
			line = br.readLine();
			xy[i][0] = parseInt(line.substring(0, line.indexOf(' ')));
			xy[i][1] = parseInt(line.substring(line.indexOf(' ') + 1));
			x.put(xy[i][0], 0);
			y.put(xy[i][1], 0);
		}

		//x
		int _i;
		_i = 0;
		for (Map.Entry<Integer,Integer> e : x.entrySet()) {
			e.setValue(_i);
			_i++;
		}

		//y
		_i = 0;
		for (Map.Entry<Integer,Integer> e : y.entrySet()) {
			e.setValue(_i);
			_i++;
		}

		//sum
		int[][] map = new int[x.size()][y.size()];
		for (int i = 1; i <= n; i++) {
			map[x.get(xy[i][0])][y.get(xy[i][1])] = 1;
		}
		for (int i = 1; i < map.length; i++) {
			for (int j = 1; j < map[0].length; j++) {
				map[i][j] += (map[i][j - 1] + map[i - 1][j] - map[i - 1][j - 1]);
			}
		}

		//query
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < m; i++) {
			words = br.readLine().split(" ");
			int x1, y1, x2, y2;
			x1 = (int) ((NavigableMap<Integer,Integer>) x).lowerEntry(parseInt(words[0])).getValue();
			y1 = (int) ((NavigableMap<Integer,Integer>) y).lowerEntry(parseInt(words[1])).getValue();
			x2 = (int) ((NavigableMap<Integer,Integer>) x).floorEntry(parseInt(words[2])).getValue();
			y2 = (int) ((NavigableMap<Integer,Integer>) y).floorEntry(parseInt(words[3])).getValue();
			int c = map[x2][y2] - map[x1][y2] - map[x2][y1] + map[x1][y1];
			sb.append(c).append('\n');
		}
		System.out.print(sb.toString());

	} //end main
}