import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static int[] DR = { 1, 0, -1, 0 };
	static int[] DC = { 0, 1, 0, -1 };

	public static void main(String[] args) {
		while (true) {
			int N = sc.nextInt();
			if (N == 0) break;
			int[] L = new int[N];
			int[] R = new int[N];
			int[] T = new int[N];
			int[] B = new int[N];
			TreeSet<Integer> setX = new TreeSet<Integer>();
			TreeSet<Integer> setY = new TreeSet<Integer>();
			for (int i = 0; i < N; ++i) {
				L[i] = sc.nextInt();
				setX.add(L[i]);
				T[i] = sc.nextInt();
				setY.add(T[i]);
				R[i] = sc.nextInt();
				setX.add(R[i]);
				B[i] = sc.nextInt();
				setY.add(B[i]);
			}
			int[] posX = new int[setX.size()];
			int idx = 0;
			for (int p : setX) {
				posX[idx++] = p;
			}
			int[] posY = new int[setY.size()];
			idx = 0;
			for (int p : setY) {
				posY[idx++] = p;
			}
			long[][] v = new long[posY.length][posX.length];
			boolean[][] visited = new boolean[posY.length][posX.length];
			for (int i = 0; i < N; ++i) {
				L[i] = Arrays.binarySearch(posX, L[i]);
				R[i] = Arrays.binarySearch(posX, R[i]);
				T[i] = Arrays.binarySearch(posY, T[i]);
				B[i] = Arrays.binarySearch(posY, B[i]);
				for (int j = B[i]; j < T[i]; ++j) {
					for (int k = L[i]; k < R[i]; ++k) {
						v[j][k] |= (1L << i);
					}
				}
			}
			int ans = 1; // outer
			for (int i = 0; i < posY.length; ++i) {
				for (int j = 0; j < posX.length; ++j) {
					if (visited[i][j]) continue;
					if (v[i][j] == 0) --ans;
					++ans;
					ArrayDeque<Integer> q = new ArrayDeque<Integer>();
					q.add((i << 10) + j);
					visited[i][j] = true;
					while (!q.isEmpty()) {
						int pos = q.poll();
						int cr = pos >> 10;
						int cc = pos & 0x3FF;
						for (int k = 0; k < 4; ++k) {
							int nr = cr + DR[k];
							int nc = cc + DC[k];
							if (nr < 0 || posY.length <= nr || nc < 0 || posX.length <= nc || visited[nr][nc]) continue;
							if (v[cr][cc] != v[nr][nc]) continue;
							visited[nr][nc] = true;
							q.add((nr << 10) + nc);
						}
					}
				}
			}
			System.out.println(ans);
		}
	}
}