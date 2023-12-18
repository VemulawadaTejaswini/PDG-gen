import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int h = Integer.parseInt(sa[0]);
		int w = Integer.parseInt(sa[1]);
		sa = br.readLine().split(" ");
		int ch = Integer.parseInt(sa[0]) - 1;
		int cw = Integer.parseInt(sa[1]) - 1;
		sa = br.readLine().split(" ");
		int dh = Integer.parseInt(sa[0]) - 1;
		int dw = Integer.parseInt(sa[1]) - 1;
		char[][] s = new char[h][w];
		for (int i = 0; i < h; i++) {
			s[i] = br.readLine().toCharArray();
		}
		br.close();

		int[][] d = new int[h][w];
		for (int i = 0; i < h; i++) {
			Arrays.fill(d[i], Integer.MAX_VALUE);
		}

		Deque<Integer> que = new ArrayDeque<>();
		que.add(ch * w + cw);
		d[ch][cw] = 0;
		while (!que.isEmpty()) {
			int cur = que.poll();
			int cx = cur / w;
			int cy = cur % w;
			for (int nx = cx - 2; nx <= cx + 2; nx++) {
				if (nx < 0 || h <= nx) {
					continue;
				}
				for (int ny = cy - 2; ny <= cy + 2; ny++) {
					if (ny < 0 || w <= ny) {
						continue;
					}
					if (s[nx][ny] == '#') {
						continue;
					}
					if (d[nx][ny] > d[cx][cy] &&
							Math.abs(nx - cx) + Math.abs(ny - cy) <= 1) {
						d[nx][ny] = d[cx][cy];
						que.addFirst(nx * w + ny);
					} else if (d[nx][ny] > d[cx][cy] + 1) {
						d[nx][ny] = d[cx][cy] + 1;
						que.addLast(nx * w + ny);
					}
				}
			}
		}
		if (d[dh][dw] == Integer.MAX_VALUE) {
			System.out.println(-1);
		} else {
			System.out.println(d[dh][dw]);
		}
	}
}
