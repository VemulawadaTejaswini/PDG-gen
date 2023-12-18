import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Main {

	Scanner sc = new Scanner(in);
	
	void run() {
		int n = sc.nextInt();
		int[] p = new int[n];
		int[] q = new int[n];
		boolean[] checked = new boolean[n];
		for (int i = 0; i < n; i++)
			p[i] = sc.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		for (int i = n-1; i >= 0; i--) {
			if (!checked[i]) {
				checked[i] = true;
				if (p[i] == 0) q[i] = i;
				else {
					int index = i;
					list.clear();
					list.add(index);
					while (true) {
						index = p[index] > 0 ? min(index+p[index], n-1) : max(index+p[index], 0);
						if (checked[index]) {
							int c;
							if (list.contains(index)) c = -1;
							else c = q[index];
							for (int j : list) {
								q[j] = c;
							}
							break;
						}
						if (p[index] == 0) {
							q[index] = index;
							for (int j : list)
								q[j] = index;
							break;
						}
						list.add(index);
						checked[index] = true;
					}
				}
			}
		}
		Queue<Integer> num = new LinkedList<Integer>();
		Queue<Integer> count = new LinkedList<Integer>();
		boolean[] used = new boolean[n];
		num.add(0);
		count.add(0);
		used[0] = true;
		while (!num.isEmpty()) {
			int k = num.poll(), c = count.poll();
			if (k == n-1) {
				out.println(c);
				return;
			}
			for (int i = 1; i <= 6; i++) {
				if (!used[min(k+i, n-1)] && q[min(k+i, n-1)] > 0) {
					used[min(k+i, n-1)] = used[q[min(k+i, n-1)]] = true;
					num.add(q[min(k+i, n-1)]);
					count.add(c+1);
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}