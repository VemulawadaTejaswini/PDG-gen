import java.util.*;
import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int[][] cost = new int[n][n];

		for (int i=0; i<n; i++) {
			Arrays.fill(cost[i],-1);
		}

		for (int i=0; i<n; i++) {
			String line = br.readLine();
			String[] str = line.split(" ");
			int id = Integer.parseInt(str[0]);
			for (int j=2; j<str.length-1; j+=2) {
				cost[id][Integer.parseInt(str[j])] = Integer.parseInt(str[j+1]);
			}
		}

		boolean[] flag = new boolean[n];
		int[] d = new int[n];
		boolean fin = false;

		Arrays.fill(d,-1);
		flag[0] = true;
		d[0] = 0;
		int now = 0;

		while (!fin) {
			for (int i=0; i<n; i++) {
				if (cost[now][i] != -1 && !flag[i]) {
					if (d[i] == -1)
						d[i] = d[now]+cost[now][i];
					else
						d[i] = Math.min(d[i],d[now]+cost[now][i]);
				}
			}

			fin = true;
			int min = Integer.MAX_VALUE;

			for (int i=0; i<n; i++) {
				if (min > d[i] && d[i] != -1 && !flag[i]) {
					min = d[i];
					now = i;
					fin = false;
				}
			}
			flag[now] = true;
		}

		for (int i=0; i<n; i++) {
			System.out.println(i+" "+d[i]);
		}

		br.close();
	}
}