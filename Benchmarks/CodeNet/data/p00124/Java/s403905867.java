
import static java.util.Arrays.deepToString;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}
	void tr(Object... os) {
		System.err.println(deepToString(os));
	}

	Scanner sc = new Scanner(System.in);
	public void run() {
		boolean first = true;
		for (;sc.hasNext();) {
			int n = sc.nextInt();
			if (n == 0) break;
			if (first) first = false; else System.out.println(); 
			T[] ts = new T[n];
			for (int i = 0; i < n; i++) {
				T t = new T();
				t.id = i;
				t.name = sc.next();
				int win = sc.nextInt();
				int lose = sc.nextInt();
				int draw = sc.nextInt();
				t.point = win * 3 + draw * 1;
				ts[i] = t;
			}
			Arrays.sort(ts);
			for (T t : ts) {
				System.out.println(t.name+","+t.point);
			}
			
		}
	}
	
	class T implements Comparable<T> {
		String name;
		int id;
		int point;
		@Override
		public int compareTo(T o) {
			if (point != o.point) return -(point - o.point);
			return (id - o.id);
		}
	}
}