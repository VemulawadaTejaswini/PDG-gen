import java.util.*;
import java.io.*;

public class Main {
	static FastReader f = new FastReader();
	static PrintWriter out = new PrintWriter(System.out);

	static int[][] DIR = {{1,0},{0,1},{-1,0},{0,-1}};
	static int h, w;
	public static void main(String[] args) {
		h = f.nextInt();
		w = f.nextInt();
		
		int startI = f.nextInt() - 1, startJ = f.nextInt() - 1;
		int endI = f.nextInt() - 1, endJ = f.nextInt() - 1; 
		char[][] arr = new char[h][w];
		for(int i=0;i<h;i++) {
			arr[i] = f.next().toCharArray();
		}

		int[][] seg = new int[h][w];
		int lastSeg = 0;
		for(int i=0;i<h;i++) {
			for(int j=0;j<w;j++) {
				if(seg[i][j] == 0 && arr[i][j] != '#') {
					Queue<int[]> que = new ArrayDeque<>();
					que.add(new int[] {i,j});
					++lastSeg;
					seg[i][j] = lastSeg;
					
					while(!que.isEmpty()) {
						int[] now = que.poll();

						for(int[] d : DIR) {
							int nowI = now[0] + d[0];
							int nowJ = now[1] + d[1];

							if(good(nowI, nowJ) && arr[nowI][nowJ] == '.' && seg[nowI][nowJ] == 0) {
								seg[nowI][nowJ] = lastSeg;
								que.add(new int[]{nowI, nowJ});
							}
						}
					}
				}
			}
		}

		Node[] nodes = new Node[lastSeg+1];
		for(int i=0;i<=lastSeg;i++) {
			nodes[i] = new Node();
		}
		for(int i=0;i<h;i++) {
			for(int j=0;j<w;j++) {
				if(seg[i][j] == 0) {
					continue;
				}
				for(int k1=-2;k1<=2;k1++) {
					for(int k2=-2;k2<=2;k2++) {
						int nowI = i+k1, nowJ = j+k2;
						if(!good(nowI,nowJ)) {
							continue;
						}
						if(seg[nowI][nowJ] != 0 && seg[nowI][nowJ] != seg[i][j] && !nodes[seg[i][j]].set.contains(seg[nowI][nowJ])) {
							nodes[seg[i][j]].set.add(seg[nowI][nowJ]);
							nodes[seg[nowI][nowJ]].set.add(seg[i][j]);
						}
					}
				}
			}
		}

		int startNode = seg[startI][startJ];
		boolean[] vis = new boolean[lastSeg+1];
		Queue<Integer> que = new ArrayDeque<>();
		vis[startNode] = true;
		nodes[startNode].dist = 0;
		int dist = 0;
		que.add(startNode);

		while(!que.isEmpty()) {
			Queue<Integer> next = new ArrayDeque<>();
			dist++;

			while(!que.isEmpty()) {
				int now = que.poll();
				for(int i : nodes[now].set) {
					if(!vis[i]) {
						vis[i] = true;
						nodes[i].dist = dist;
						next.add(i);
					}
				}
			}

			que = next;
		}

		out.println(nodes[seg[endI][endJ]].dist == Integer.MAX_VALUE ? -1 : nodes[seg[endI][endJ]].dist);
		out.close();
	}
	
	static class Node {
		int dist = Integer.MAX_VALUE;
		TreeSet<Integer> set = new TreeSet<>();
	}

	static boolean good(int i, int j) {
		return 0 <= i && i < h && 0 <= j && j < w;
	}
	static class FastReader {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		String next() {
			while(st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch(IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		String nextLine() {
			String str = "";

			try {
				str = br.readLine();
			} catch(IOException e) {
				e.printStackTrace();
			}
			return str;
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}
	}
}