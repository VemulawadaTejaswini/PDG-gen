import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

/**
 * Star Watching
 */
public class Main {

	static final int[][] OP1 = {{7, 22}, {8, 23}, {9, 24}, {10, 12}, {13, 18}};
	static final int[][] OP2 = {{1, 28}, {2, 29}, {3, 30}, {15, 16}, {19, 21}};
	static final int[][] OP3 = {{1, 24}, {4, 27}, {7, 30}, {10, 21}, {16, 18}};
	static final int[][] OP4 = {{3, 22}, {6, 25}, {9, 28}, {12, 19}, {13, 15}};

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		while ((line = br.readLine()) != null && !line.isEmpty()) {
			int n = Integer.parseInt(line);
			for (int i = 0; i < n; i++) {
				line = br.readLine();
				byte[] puzzle = new byte[31];
				for (int j = 0; j < line.length() / 2 + 1; j++) {
					puzzle[j + 1] = (byte) (line.charAt(j * 2) - '0');
				}

				int ans = 0;
				Deque<byte[]> queue = new ArrayDeque<byte[]>();
				queue.offer(puzzle);

				while (queue.size() > 0) {
					byte[] p = queue.poll();
					if (judge(p)) {
						ans = p[0];
						break;
					} else {
						for (int j = 0; j < 4; j++) {
							queue.offer(operate(p, j));
						}
					}
				}
				System.out.println(ans);
			}
		} // end while
	} // end main

	static boolean judge(byte[] p) {
		boolean ret = true;
		if (p[1] != (p[1] | p[2] | p[3] | p[4] | p[5] | p[6] | p[7] | p[8] | p[9])) {
			ret &= false;
		}
		if (p[22] != (p[22] | p[23] | p[24] | p[25] | p[26] | p[27] | p[28] | p[29] | p[30])) {
			ret &= false;
		}
		if (p[10] != (p[10] | p[11] | p[12])) {
			ret &= false;
		}
		if (p[13] != (p[13] | p[14] | p[15])) {
			ret &= false;
		}
		if (p[16] != (p[16] | p[17] | p[18])) {
			ret &= false;
		}
		if (p[19] != (p[19] | p[20] | p[21])) {
			ret &= false;
		}
		return ret;
	}

	static byte[] operate(byte[] p, int o) {
		byte[] _p = Arrays.copyOf(p, p.length);
		int[][] _o = null;
		switch (o) {
			case 0:
				_o = OP1;
				break;
			case 1:
				_o = OP2;
				break;
			case 2:
				_o = OP3;
				break;
			case 3:
				_o = OP4;
				break;
		}
		for (int i = 0; i < _o.length; i++) {
			byte tmp = _p[_o[i][0]];
			_p[_o[i][0]] = _p[_o[i][1]];
			_p[_o[i][1]] = tmp;
		}
		_p[0]++;
		return _p;
	}
}