import java.util.*;
import java.awt.geom.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayDeque<Integer> ans = new ArrayDeque<Integer>();

		while(sc.hasNext()){
			double[] x = new double[3];
			double[] y = new double[3];
			for(int i=0;i<3;i++){
				x[i] = sc.nextDouble();
				y[i] = sc.nextDouble();
			}
			double xp = sc.nextDouble();
			double yp = sc.nextDouble();
			
			if(Line2D.linesIntersect(x[0],y[0],x[1],y[1],x[2],y[2],xp,yp)==false
					&& Line2D.linesIntersect(x[1],y[1],x[2],y[2],x[0],y[0],xp,yp)==false
					&& Line2D.linesIntersect(x[2],y[2],x[0],y[0],x[1],y[1],xp,yp)==false){
				Arrays.sort(x);
				Arrays.sort(y);
				if(x[0]<xp && x[2]>xp && y[0]<yp && y[2]>yp){
					ans.push(1);
				}else{
					ans.push(0);
				}
			}else{
				ans.push(0);
			}
			
		}
		int num = ans.size();
		for(int i=0;i<num;i++){
			int z = ans.pollLast();
			if(z==1){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		}
	}
}