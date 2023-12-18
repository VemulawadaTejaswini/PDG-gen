import java.util.Scanner;
import java.util.TreeSet;

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
		Scanner sc = new Scanner(System.in);
		int n, m;
		int vertex[];
		Edge edge[];
		TreeSet<Integer> set[];

		n = sc.nextInt();
		while (n != 0) {
			m = sc.nextInt();
			set = new TreeSet[n];
			vertex = new int[n];
			edge = new Edge[m];
			for (int i = 0; i < m; i++) {
				String s[] = sc.next().split(",");
				edge[i] = new Edge(Integer.valueOf(s[0]), Integer.valueOf(s[1]), Integer.valueOf(s[2]));
			}
			for (int i = 0; i < n; i++) {
				set[i] = new TreeSet();
				set[i].add(i);
				vertex[i] = i;
			}
			sort(edge, 0, m - 1);

			for (int i = 0; i < m; i++) {
				if (vertex[edge[i].v1] != vertex[edge[i].v2]) {
					edge[i].mark = true;
					int num1 = vertex[edge[i].v1];
					int num2 = vertex[edge[i].v2];
					set[num1].addAll(set[num2]);
					while (!set[num2].isEmpty()) {
						vertex[set[num2].first()] = num1;
						set[num2].remove(set[num2].first());
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

			n = sc.nextInt();
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