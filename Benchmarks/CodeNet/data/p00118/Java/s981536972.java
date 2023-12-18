import static java.lang.System.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;

/**
 * http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=ITP1_1_D
 * 
 * @author Kyoro
 */
public class Main {

	private int H, W;
	private char ground[][];
	private BufferedReader reader;
	LinkedList<Integer> stack;

	public Main() {
		reader = new BufferedReader(new InputStreamReader(in));
	}

	public void init() {
		ground = new char[102][102];
		for (int i = 0; i < ground.length; i++) {
			Arrays.fill(ground[i], 'x');
		}
		stack = new LinkedList<Integer>();
	}

	public boolean read() throws IOException {
		init();
		String line = reader.readLine();
		String tokens[] = line.trim().split(" ");
		H = Integer.parseInt(tokens[0]);
		W = Integer.parseInt(tokens[1]);
		if (H == 0 || W == 0) {
			return false;
		}
		for (int h = 0; h < H; h++) {
			line = reader.readLine();
			for (int w = 0; w < W; w++) {
				ground[h + 1][w + 1] = line.charAt(w);
			}
		}
		return true;
	}

	public String solve() {
		int area;
		char g;
		int w, h;
		int count = 0;
		for (h = 1; h <= H; h++) {
			for (w = 1; w <= W; w++) {
				area = dfs(ground[h][w], h, w);
				if (area > 0) {
					count++;
				}
			}
		}
		return String.format("%d", count);
	}

	public int dfs(char g, int h, int w) {
		stack.push(h);
		stack.push(w);

		int area = 0;
		while (!stack.isEmpty()) {
			w = stack.pop();
			h = stack.pop();
			if (ground[h][w] == 'x' || ground[h][w] != g) {
				continue;
			}
			ground[h][w] = 'x';
			area++;
			stack.push(h + 1);
			stack.push(w);
			stack.push(h);
			stack.push(w + 1);
			stack.push(h - 1);
			stack.push(w);
			stack.push(h);
			stack.push(w - 1);
		}
		return area;
	}

	public static void main(String[] args) {
		Main main = new Main();
		try {
			while (main.read()) {
				out.println(main.solve());
			}
		} catch (IOException e) {
			err.println(e);
		}
	}
}

