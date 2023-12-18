import java.util.*;
import java.io.*;

class Main {

	static class Edge {
		int cost;
		int node1;
		int node2;

		Edge(int cost,int node1,int node2){
			this.cost = cost;
			this.node1 = node1;
			this.node2 = node2;
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		List<List<Edge>> Ed = new ArrayList<List<Edge>>();

		for (int i=0; i<n; i++) {

			String line = br.readLine();
			String[] str = line.split(" ");
			List<Edge> list = new ArrayList<Edge>();

			for (int j=2; j<str.length; j+=2) {

				int cost = Integer.parseInt(str[j+1]);
				int node = Integer.parseInt(str[j]);
				Edge edge = new Edge(cost,i,node);

				list.add(edge);
			}
			Ed.add(list);
		}

		boolean[] flag = new boolean[n];
		int[] d = new int[n];
		boolean fin = false;

		Arrays.fill(d,-1);
		flag[0] = true;
		d[0] = 0;
		int now = 0;

		while (!fin) {
			for (int i=0; i<Ed.get(now).size(); i++) {
				int to = Ed.get(now).get(i).node2;
				if (!flag[to]) {
					if (d[to] == -1)
						d[to] = d[now]+Ed.get(now).get(i).cost;
					else
						d[to] = Math.min(d[to],d[now]+Ed.get(now).get(i).cost);
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