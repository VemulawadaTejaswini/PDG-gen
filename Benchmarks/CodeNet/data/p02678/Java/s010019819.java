import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().execute(System.in, System.out);
	}

	int[] links;
	int[] nexts;
	List<Integer>[] roads;

	@SuppressWarnings("unchecked")
	public void execute(InputStream in, PrintStream out) {
		Scanner sc = new Scanner(in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		links = new int[n];
		nexts = new int[n + 1];
		roads = new List[n + 1];

		int a, b;
		for (int i = 0; i < m; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			
			addRoad(a, b);
			addRoad(b, a);
		}
		sc.close();
		
		nexts[1] = 1;
		linkRooms();

		for (int i = 1; i <= n; i++) {
			if (nexts[i] == 0) {
				out.println("No");
				return;
			}
		}
		
		out.println("Yes");
		for (int i = 2; i <= n; i++) {
			out.println(nexts[i]);
		}
	}

	private void linkRooms() {
		int len = links.length;

		int idx = 0;
		int cnt = 0;
		links[cnt++] = 1;

		while (idx < len) {
			int i = links[idx++];
			List<Integer> r = roads[i];
			if (r != null) {
				for (int k : r) {
					if (nexts[k] == 0) {
						nexts[k] = i;
						links[cnt++] = k;
					}
				}
			}
		}
	}

	private void addRoad(int x, int y) {
		List<Integer> r = roads[x];
		if (r == null) {
			r = new ArrayList<Integer>();
			roads[x] = r;
		}
		r.add(y);
	}

}
