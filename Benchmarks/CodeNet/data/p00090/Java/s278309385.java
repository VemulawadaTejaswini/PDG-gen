import java.awt.geom.Point2D;
import java.util.*;

public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}

	public Main() {
		new AOJ0090().doIt();
	}

	class AOJ0090{
		void doIt(){
			final double EPS=1.0e-8;
			while(true){
				int n = in.nextInt();
				if(n==0)break;
				ArrayList<Point2D> list = new ArrayList<Point2D>();
				for(int i=0;i<n;i++){
					String res[] = in.next().split(",");
					list.add(new Point2D.Double(Double.parseDouble(res[0]),Double.parseDouble(res[1])));
				}
				int result = 1;
				for(int i=0;i<n;i++){
					int cnt = 1;
					for(int s=0;s<n;s++)if(i!=s){
						double dis2 = list.get(i).distance(list.get(s));
						double dis =(list.get(i).getX()-list.get(s).getX())*((list.get(i).getX()-list.get(s).getX()))
								+(list.get(i).getY()-list.get(s).getY())*(list.get(i).getY()-list.get(s).getY());
						if(dis2<=2.000000)cnt++;
					}
					result = Math.max(result, cnt);
				}
				System.out.println(result);
			}
		}
	}

}