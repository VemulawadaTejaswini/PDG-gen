import java.util.*;
import java.awt.geom.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayDeque<Integer> ans = new ArrayDeque<Integer>();

		while(sc.hasNext()){
			double xa = sc.nextDouble();
			double ya = sc.nextDouble();
			double xb = sc.nextDouble();
			double yb = sc.nextDouble();
			double xc = sc.nextDouble();
			double yc = sc.nextDouble();
			double xd = sc.nextDouble();
			double yd = sc.nextDouble();
			
			if(Line2D.linesIntersect(xa,ya,xb,yb,xc,yc,xd,yd)==false
					&& Line2D.linesIntersect(xb,yb,xc,yc,xa,ya,xd,yd)==false
					&& Line2D.linesIntersect(xc,yc,xa,ya,xb,yb,xd,yd)==false){
				ans.push(1);
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