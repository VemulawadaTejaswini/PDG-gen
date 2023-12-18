import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		while(true) {
			int n = stdIn.nextInt();
			int m = stdIn.nextInt();
			int a = stdIn.nextInt();
			if(n == 0 && m == 0 && a == 0) break;
			Line[] line = new Line[m];
			for(int i = 0; i < m; i++) {
				int h = stdIn.nextInt();
				int p = stdIn.nextInt();
				int q = stdIn.nextInt();
				line[i] = new Line(h,p,q);
			}
			Arrays.sort(line,new MyComparator());
			int nowp = a;
			for(int i = 0; i < m; i++) {
				if(line[i].a == nowp) {
					nowp = line[i].b;
				}
				else if(line[i].b == nowp) {
					nowp = line[i].a;
				}
			}
			System.out.println(nowp);
			
		}
		
	}
}
class MyComparator implements Comparator<Line> {

	@Override
	public int compare(Line o1, Line o2) {
		if(o1.h > o2.h) {
			return -1;
		}
		if(o1.h < o2.h) {
			return 1;
		}
		return 0;
	}
	
}
class Line {
	int h;
	int a;
	int b;
	public Line(int h, int a, int b) {
		this.h = h;
		this.a = a;
		this.b = b;
	}
}