import java.util.*;
import java.io.*;

class Main {

	static int n;
	static int[] d;
	static int[] f;
	static int[][] adj;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		n = Integer.parseInt(br.readLine());
		adj = new int[n][n];

		for (int i=0; i<n; i++) {
			String line = br.readLine();
			String[] str = line.split(" ");
			for (int j=2; j<str.length; j++) {
				adj[Integer.parseInt(str[0])-1][Integer.parseInt(str[j])-1] = 1;
			}
		}

		Queue<Integer> que = new LinkedList<Integer>();

		int[] d = new int[n];
		Arrays.fill(d,-1);
		d[0] = 0;
		que.add(0);
		while (que.size() != 0) {
			int now = que.poll();
			for (int i=0; i<n; i++) {
				if (adj[now][i] == 1 && i != now && d[i] == -1){
					que.add(i);
					d[i] = d[now]+1;
				}
			}
		}

		for (int i=0; i<n; i++) {
			System.out.println((i+1)+" "+d[i]);
		}

		br.close();
	}

}