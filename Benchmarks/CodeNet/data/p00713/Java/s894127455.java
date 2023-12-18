import java.awt.geom.Point2D;
import java.util.*;

public class Main {
	final double EPS = 1.0e-08;
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			if(n == 0) break;
			double [] x = new double[n];
			double [] y = new double[n];
			for(int i=0; i < n; i++){
				x[i] = sc.nextDouble();
				y[i] = sc.nextDouble();
			}
			int ans = 1;
			for(int i=0; i < n; i++){
				for(int j=i+1; j < n; j++){
					double midx = (x[i] + x[j]) / 2.0;
					double midy = (y[i] + y[j]) / 2.0;
					double halfdis = Point2D.distance(x[i], y[i], x[j], y[j]) / 2;
					if(halfdis > 1.0){
						continue;
					}
					double midxV = x[i] - midx;
					double midyV = y[i] - midy;
					double tocenterDis = Math.sqrt(1.0 - halfdis * halfdis);
					for(int k=0; k <= 1;k++){
						double midxV2, midyV2;
						if(k==0){
							midxV2 = midyV * -1;
							midyV2 = midxV;
						}
						else{
							midxV2 = midyV;
							midyV2 = midxV * -1;
						}
						double cx = (midxV2) * tocenterDis + midx;
						double cy = (midyV2) * tocenterDis + midy;
						int res = getCount(cx,cy,x,y);
						ans = Math.max(ans, res);
					}
				}
			}
			//System.out.print("ANS= ");
			System.out.println(ans);
		}
	}

	private int getCount(double cx, double cy, double[] x, double[] y) {
		int count = 0;
		for(int i=0; i < x.length;i++){
			double res = Point2D.distance(cx, cy, x[i], y[i]);
			if(res <= 1.0){
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();
	}
}