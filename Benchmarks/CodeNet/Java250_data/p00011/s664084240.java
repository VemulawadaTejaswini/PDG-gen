import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Main {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int w = Integer.parseInt(br.readLine());

		int n = Integer.parseInt(br.readLine());

		int[] ans = new int[w + 1];

		List<points> line = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			String[] s_points = br.readLine().split(",");

			line.add(new points(Integer.parseInt(s_points[0]), Integer.parseInt(s_points[1])));
		}

		Deque<points> d = new ArrayDeque<>();

		for (int i = 1; i <= w; i++) {
			int target = i;
			d.addAll(line);
			while (!(d.isEmpty())) {
				points p = d.poll();

				if (target == p.point_a) {
					target = p.point_b;
				} else if (target == p.point_b) {
					target = p.point_a;
				}
				/* System.out.println(p.point_a+" "+p.point_b); */
			}
			ans[target] = i;
		}
		for (int i = 1; i <= w; i++) {
			System.out.println(ans[i]);
		}
	}

	static class points {
		int point_a;
		int point_b;

		public points(int a, int b) {
			this.point_a = a;
			this.point_b = b;
		}
	}

}