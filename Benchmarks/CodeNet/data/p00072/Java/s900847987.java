import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
	static class Edge {
		int v1, v2;
		int weight;
		boolean mark;

		Edge (int v1, int v2, int weight) {
			this.v1 = v1;
			this.v2 = v2;
			this.weight = weight;
			this.mark = false;
		}
	}

	public static void main(String args[]) {
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		int n, m;
		Edge edge[];
		int vertex[];

		try {
			n = Integer.valueOf(br.readLine());
			while (n != 0) {
				m = Integer.valueOf(br.readLine());
				vertex = new int[n];
				edge = new Edge[m];
				for (int i = 0; i < m; i++) {
					String s[] = br.readLine().split(",");
					edge[i] = new Edge(Integer.valueOf(s[0]), Integer.valueOf(s[1]), Integer.valueOf(s[2]));
				}
				for (int i = 0; i < n; i++) {
					vertex[i] = i;
				}
				sort(edge, 0, m - 1);

				for (int i = 0; i < m; i++) {
					if (vertex[edge[i].v1] != vertex[edge[i].v2]) {
						edge[i].mark = true;
						int num = vertex[edge[i].v2];
						for (int j = 0; j < n; j++) {
							if (vertex[j] == num) {
								vertex[j] = vertex[edge[i].v1];
							}
						}
					}
				}

				int sum = 0;
				for (int i = 0; i < m; i++) {
					if (edge[i].mark) {
						sum += ((edge[i].weight - 100) / 100);
					}
				}
				System.out.println(sum);

				n = Integer.valueOf(br.readLine());
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void sort(Edge edge[], int low, int high) {
		if (high <= low) {
			return ;
		}
		int i = low;
		int j = high;
		int x = edge[(low + high) / 2].weight;
		while (i <= j) {
			while (edge[i].weight < x) {
				i++;
			}
			while (x < edge[j].weight) {
				j--;
			}
			if (i <= j) {
				Edge swap = new Edge(edge[i].v1, edge[i].v2, edge[i].weight);
				edge[i] = edge[j];
				edge[j] = swap;
				i++;
				j--;
			}
			sort(edge, low, j);
			sort(edge, i, high);
		}
	}
}