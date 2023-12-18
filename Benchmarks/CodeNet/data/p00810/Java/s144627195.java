import java.util.*;
import java.awt.geom.*;
public class Main {
	
	//0:50 cording start
	//1:13 cording fin
	//1:37 sleep
	class P3D {
		double x,y,z;

		public P3D(double x, double y, double z) {
			this.x = x;
			this.y = y;
			this.z = z;
		}
		
		
		public double distance(P3D b) {
			double x = this.x - b.x;
			double y = this.y - b.y;
			double z = this.z - b.z;
			double dissq =  x * x + y * y + z * z;
			return Math.sqrt(dissq);
		}
	}

	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n == 0 ) break;
			P3D [] plist = new P3D[n];
			double cx = 0,cy = 0,cz=0;
			for(int i = 0; i < n; i++){
				double x = sc.nextDouble();
				double y = sc.nextDouble();
				double z = sc.nextDouble();
				plist[i] = new P3D(x, y, z);
				cx += x;
				cy += y;
				cz += z;
			}
			cx = cx / n;
			cy = cy / n;
			cz = cz / n;
			P3D startP = new P3D(cx, cy, cz);
			double mindis = 1 << 24;
			double move = 0.5;
			while(move > 1.0e-10){
				for(int i = 0; i < 10000; i++){
					double mostdis = -1;
					mindis = 1 << 24;
					int mostdisId = -1;
					for(int j = 0; j < n; j++){
						double nowdis = startP.distance(plist[j]);
						mindis = Math.min(mindis, nowdis);
						if(mostdis < nowdis){
							mostdis = nowdis;
							mostdisId = j;
						}
					}
					P3D mostdisP = plist[mostdisId];
					double movex = (mostdisP.x - startP.x) * move;
					double movey = (mostdisP.y - startP.y) * move;
					double movez = (mostdisP.z - startP.z) * move;
					startP.x = startP.x + movex;
					startP.y = startP.y + movey;
					startP.z = startP.z + movez;
				}
				move = move / 2;
			}
			System.out.printf("%.5f\n",mindis);
		}
	}
	
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();
	}
}