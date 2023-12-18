import java.util.*;
import java.awt.geom.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			if(n==0) break;
			
			Line2D.Double[] k = new Line2D.Double[n];
			Point2D.Double[] p1 = new Point2D.Double[n];
			Point2D.Double[] p2 = new Point2D.Double[n];

			int count = 1;
			for(int i=0;i<n;i++){
				p1[i] = new Point2D.Double(sc.nextInt(),sc.nextInt());
				p2[i] = new Point2D.Double(sc.nextInt(),sc.nextInt());
				k[i] = new Line2D.Double(p1[i],p2[i]);
				for(int j=i-1;j>=0;j--){
					if(p1[i].equals(p1[j]) || p1[i].equals(p2[j]) || p2[i].equals(p1[j]) || p2[i].equals(p2[j])){
					}else if(k[i].intersectsLine(k[j])==true){
						count++;
					}
				}
			}
			System.out.println(n+count);
		}	
	}	
}