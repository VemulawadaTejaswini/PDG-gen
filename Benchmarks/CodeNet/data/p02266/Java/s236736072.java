import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// BufferedReader br = new BufferedReader(new FileReader("in1.txt"));
		// BufferedReader br = new BufferedReader(new FileReader("in2.txt"));
		
		List<Integer> y = new ArrayList<Integer>();
		List<Integer> max_y_l = new ArrayList<Integer>();
		y.add(0);
		max_y_l.add(Integer.MIN_VALUE);
		String line = br.readLine();
		int n = line.length() + 1;
		for (int i = 0; i < line.length(); i++) {
			char c = line.charAt(i);
			int last_y = y.get(i);
			if (c == '\\')
				y.add(last_y - 1);
			else if (c == '/')
				y.add(last_y + 1);
			else
				y.add(last_y);
			max_y_l.add(Math.max(max_y_l.get(i), y.get(i)));
		}
		
		int A = 0;
		List<Integer> L = new ArrayList<Integer>();
		int x = n - 1;
		while (x > 0) {
			// x1????????????????????????????????¶???
			if (y.get(x) <= max_y_l.get(x) && y.get(x - 1) < y.get(x)) {
				int x1 = x;
				int h = y.get(x1);
				int area = 0;
				x--;
				while (x >= 0 && y.get(x) != h) {
					area += h - y.get(x);
					x--;
				}
				if (x < 0)
					break;
				// int x0 = x;
				L.add(area);
				A += area;
			} else {
				x--;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append(A);
		sb.append('\n');
		sb.append(L.size());
		for (int i = L.size() - 1; i >= 0; i--) {
			sb.append(' ');
			sb.append(L.get(i));
		}
		sb.append('\n');
		System.out.println(sb.toString());
	}
}