import java.util.*;


public class Main {
	
	int n, m;
	int[] s, t;
	
	void swap(int[] a, int[] b, int i, int j) {
		int tmp = a[i];
		a[i] = b[j];
		b[j] = tmp;
	}
	
	int sum(int[] cards) {
		int sum = 0;
		for (int i = 0; i < cards.length; i++) {
			sum += cards[i];
		}
		return sum;
	}
	
	String solve() {
		List<int[]> swaps = new ArrayList<int[]>();
		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < t.length; j++) {
				swap(s, t, i, j);
				if (sum(s) == sum(t)) {
					swaps.add(new int[]{t[j], s[i]});
				}
				swap(s, t, i, j);
			}
		}
		
		if (swaps.size() > 0) {
			int[] min = swaps.get(0);
			for (int i = 1; i < swaps.size(); i++) {
				int[] c = swaps.get(i);
				if (c[0] + c[1] < min[0] + min[1]) {
					min = c;
				}
			}
			return min[0] + " " + min[1];
		} else {
			return "-1";
		}
	}
	
	void run() {
		Scanner sc = new Scanner(System.in);
		String output = "";
		while (sc.hasNext()) {
			n = sc.nextInt();
			m = sc.nextInt();
			if (n == 0 && m == 0) {
				break;
			} else {
				s = new int[n];
				t = new int[m];
				for (int i = 0; i < n; i++) s[i] = sc.nextInt();
				for (int i = 0; i < m; i++) t[i] = sc.nextInt();
				output += solve() + "\n";
			}
		}
		sc.close();
		System.out.println(output);
	}

	public static void main(String[] args) {
		new Main().run();
	}

}