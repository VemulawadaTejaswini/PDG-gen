import java.awt.geom.Line2D;
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
				int result = Integer.MIN_VALUE;
				int cnt[]  = new int[n];
				Arrays.fill(cnt, 1);
				for(int i=0;i<n;i++)for(int s=i+1;s<n;s++){
					double dis = Math.sqrt((list.get(i).getX()-list.get(s).getX())*((list.get(i).getX()-list.get(s).getX()))
							+(list.get(i).getY()-list.get(s).getY())*(list.get(i).getY()-list.get(s).getY()));
					if(dis<=2.0){
						cnt[i]++;cnt[s]++;
					}
				}
				for(int i=0;i<n;i++)result = Math.max(result, cnt[i]);
				System.out.println(result);
			}
		}
	}

}