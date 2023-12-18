import java.io.*;
import java.util.StringTokenizer;
import java.util.ArrayList;

class Point {
	double x,y;

	Point(double x,double y) {
		this.x = x;
		this.y = y;
	}
}

class Main {
	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String buf;

		try {
			while (!(buf = br.readLine()).equals("0")) {
				int n = Integer.parseInt(buf);
				Point p[] = new Point[n];
				for (int i=0;i<n;i++) {
					buf = br.readLine();
					StringTokenizer st = new StringTokenizer(buf,",");
					p[i] = new Point(Double.parseDouble(st.nextToken()),Double.parseDouble(st.nextToken()));
				}
				quicksort(0,n-1,p);
				sorty(n,p);
				int c = convexhull(n,p);
				System.out.println(n-c);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static int convexhull(int n,Point p[]) { //逐次追加法
		ArrayList<Point> ans = new ArrayList<Point>();
		if (S(p[2],p[1],p[0])>=0) { //CCWまたは一直線
			ans.add(p[2]);
			ans.add(p[1]);
			ans.add(p[0]);
		} else { //CW
			ans.add(p[2]);
			ans.add(p[0]);
			ans.add(p[1]);
		}

		for (int i=3;i<n;i++) {
			int s = ans.size();
			Point cnt_up,cnt_down;
			int j = 0;
			int k = 1;
			while (S(p[i],ans.get(j),ans.get(k))<0) { //CW
				j = (j+1)%s;
				k = (k+1)%s;
			}
			cnt_up = ans.get(j);
			j = 0;
			k = s-1;
			while (S(p[i],ans.get(j),ans.get(k))>0) { //CCW
				j = (j+s-1)%s;
				k = (k+s-1)%s;
			}
			cnt_down = ans.get(j);

			ArrayList<Point> construct = new ArrayList<Point>();
			construct.add(p[i]);
			for (int l=ans.indexOf(cnt_up);l!=ans.indexOf(cnt_down);l=(l+1)%s) {
				construct.add(ans.get(l));
			}
			construct.add(cnt_down);

			ans.clear();
			for (int l=0;l<construct.size();l++) {
				ans.add(construct.get(l));
			}
		}
		return ans.size();
	}

	public static void quicksort(int low,int high,Point p[]) {
		if (high>low) {
			int mid = (low+high)/2;
			double x = p[mid].x;
			int i = low;
			int j = high;
			while (p[i].x<x) i++;
			while (p[j].x>x) j--;
			if (i<=j) {
				Point t =p[i];
				p[i] = p[j];
				p[j] = t;
				i++;j--;
			}
			quicksort(low,j,p);
			quicksort(i,high,p);
		}
	}

	public static void sorty(int n,Point p[]) {
		for (int i=1;i<n;i++) {
			int j = i-1;
			while (p[j].x==p[j+1].x&&p[j].y>p[j+1].y) {
				Point t = p[j+1];
				p[j+1] = p[j];
				p[j] = t;
				j--;
				if (j<0) break;
			}
		}
	}

	public static double S(Point p0,Point p1,Point p2) {
		return (p1.x-p0.x)*(p2.y-p0.y)-(p2.x-p0.x)*(p1.y-p0.y);
	}
}