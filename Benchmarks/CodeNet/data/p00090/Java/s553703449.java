import java.util.*;
import java.awt.geom.*;
public class Main {
	
	public class Circle{
		Point2D p;
		double r;
		public Circle(Point2D p, double r) {
			this.p = p; this.r = r;
		}
	}
	
	private void doit(){
		Scanner sc =new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n == 0)break;
			Circle [] clist = new Circle[n];
			for(int i = 0; i < n; i++){
				String [] s = sc.next().split(",");
				Point2D p = new Point2D.Double(Double.parseDouble(s[0]), Double.parseDouble(s[1]));
				clist[i] = new Circle(p, 1.0);
			}
			int max = 0;
			for(int i = 0; i < n; i++){
				int count = 1;
				for(int j = i + 1; j < n; j++){
					if(isoverlap(clist[i], clist[j])){
						count++;
					}
				}
				max = Math.max(max, count);
			}
			System.out.println(max);
		}
	}

	private boolean isoverlap(Circle c1, Circle c2) {
		double dis = c1.p.distance(c2.p);
		double rr = c1.r + c2.r;
		if(dis - rr < 0){
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();
	}
}