import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		DjSet djs = new DjSet(n);

		int q = scan.nextInt();
		for (int i = 0; i < q; i++)
			switch (scan.nextInt()) {
			case (0):
				djs.union(scan.nextInt(), scan.nextInt());
				break;
			case (1):
				if (djs.isSame(scan.nextInt(), scan.nextInt()))
					System.out.println("1");
				else
					System.out.println("0");
			}

		scan.close();
		System.exit(0);
	}
}

class DjSet {
	int[] parent;
	int[] height;

	public DjSet(int n) {
		parent = new int[n];
		height = new int[n];
		for (int i = 0; i < n; i++)
			parent[i] = i;
	}

	public boolean isSame(int s1, int s2) {
		if (findSet(s1) == findSet(s2))
			return true;
		else
			return false;
	}

	public void union(int u1, int u2) {
		int p1 = findSet(u1);
		int p2 = findSet(u2);
		if (p1 == p2)
			return;
		if (height[p1] > height[p2])
			parent[p2] = p1;
		else if (height[p1] == height[p2]) {
			height[p1]++;
			parent[p2] = p1;
		} else
			parent[p1] = p2;
	}

	private int findSet(int id) {
		if (parent[id] != id)
			parent[id] = findSet(parent[id]);
		return parent[id];
	}
}