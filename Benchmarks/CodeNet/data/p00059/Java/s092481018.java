import java.util.*;
import java.awt.geom.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Rectangle2D.Double r = new Rectangle2D.Double();

		while(sc.hasNext()){
			double[] x = new double[4];
			double[] y = new double[4];
			for(int i=0;i<4;i++){			
				x[i] = sc.nextDouble();
				y[i] = sc.nextDouble();
			}
			
			if((x[0]==x[3] || x[1]==x[2]) && y[0]<=y[3] && y[1]>=y[2]){
				System.out.println("YES");
			}else if((y[0]==y[3] || y[1]==y[2]) && x[0]<=x[3] && x[1]>=x[2]){
				System.out.println("YES");
			}else{
				r.setRect(x[0],y[0],x[1],y[1]);
				boolean check = r.intersects(x[2], y[2], x[3], y[3]);
				if(check==true) System.out.println("YES");
				else System.out.println("NO");
			}
			
		}
	}
}