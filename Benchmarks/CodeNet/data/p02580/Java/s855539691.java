import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int M = sc.nextInt();
		int h[] = new int[H+1];
		int w[] = new int[W+1];
		Set<Point> set = new HashSet<Point>();
		Main main = new Main();
		for (int i=0;i<M;i++) {
			Point p = main.new Point();
			p.x = sc.nextInt();
			p.y = sc.nextInt();
			h[p.x]++;
			w[p.y]++;
			set.add(p);
		}
		int maxx=0;
		int maxy=0;
		for (int i=0;i<=H;i++) {
			if (h[i]>maxx) {
				maxx= h[i];
			}
		}
		for (int i=0;i<=W;i++) {
			if (w[i]>maxy) {
				maxy= w[i];
			}
		}
		List<Integer> hl = new ArrayList<Integer>();
		for (int i=0;i<=H;i++) {
			if (h[i]==maxx) {
				hl.add(i);
			}
		}
		List<Integer> wl = new ArrayList<Integer>();
		for (int i=0;i<=W;i++) {
			if (w[i]==maxy) {
				wl.add(i);
			}
		}
		for (int i=0;i<hl.size();i++) {
			for (int j=0;j<wl.size();j++) {
				Point p = main.new Point();
				p.x= hl.get(i);
				p.y= wl.get(j);
				if (!set.contains(p)) {
					System.out.println(maxx+maxy);
					return ;
				}
			}
		}
		System.out.println(maxx+maxy-1);

	}

	public class Point extends Object{
		int x;
		int y;

		public int hashCode() {
			return x*100+y;
		}

		public boolean equals(Object o) {
			Point temp = (Point)o;
			if (temp.x==x&&temp.y==y) {
				return true;
			}
			return false;
		}
	}
}