import java.util.*; 
 
public class Main
{
	public static void main(String args[]) throws Exception{
		new Main().run();
	}

	int w,h;
	
	public void run()
	{
		int i,j,k,l;
		Scanner cin=new Scanner(System.in);
		while(true){
			int N = cin.nextInt();
			if(N==0) break;
			double sx,sy,ex,ey;
			sx = cin.nextDouble();
			sy = cin.nextDouble();
			ex = cin.nextDouble();
			ey = cin.nextDouble();
			double h[] = new double[N];
			double mindist[] = new double[N];
			double res = 999999999;
			for(i=0;i<N;i++){
				double minx, maxx, miny, maxy;
				minx = cin.nextDouble();
				miny = cin.nextDouble();
				maxx = cin.nextDouble();
				maxy = cin.nextDouble();
				h[i] = cin.nextDouble();
				mindist[i] = res;
				double hi = 1;
				double low = 0;
				double nowdist = 0;
				for(l=0;l<200;l++){
					double left = (low+low+hi) /3;
					double right = (low + hi + hi) / 3;
					double lx = sx * left + ex * (1-left);
					double ly = sy * left + ey * (1-left);
					double rx = sx * right + ex * (1-right);
					double ry = sy * right + ey * (1-right);
					
					double ldist = dist(minx,miny, maxx, maxy,lx,ly);
					double rdist = dist(minx,miny, maxx, maxy,rx,ry);
					if(ldist<rdist){
						hi = right;
					}
					else{
						low = left;
					}
					nowdist = ldist;
					
				}
				mindist[i] = Math.min(mindist[i], nowdist);
			}

			double hh = 100000;
			double ll = 0;
			for(l=0;l<200;l++){
				double mid = (hh + ll) / 2;
				boolean flag = false;
				for(i=0;i<N;i++){
					double need = mindist[i];
					if(mid<h[i]){
						need -= mid;
					}
					else{
						need -= Math.sqrt(mid * mid - (mid-h[i]) * (mid-h[i]));
					}
					//System.out.println(need);
					if(need<0) flag= true;
				}
				if(flag){
					hh = mid;
				}
				else{
					ll = mid;
				}
			}
			res = ll;
			System.out.println(res);
		}
	}
	double dist(double minx, double miny,double maxx, double maxy, double bx, double by){
		boolean flagx = false;
		boolean flagy = false;
		if(bx>=minx && bx<=maxx) flagx = true;
		if(by>=miny && by<=maxy) flagy = true;
		if(flagx && flagy) return 0;
		else if(flagx) return Math.min(dist(bx,miny,bx,by), dist(bx,maxy,bx,by));
		else if(flagy) return Math.min(dist(minx,by,bx,by), dist(maxx,by,bx,by));
		return Math.min(
				Math.min(dist(minx,miny,bx,by), dist(minx,maxy,bx,by)),
				Math.min(dist(maxx,miny,bx,by), dist(maxx,maxy,bx,by))
				);
	}
	
	
	double dist(double ax, double ay,double bx, double by){
		
		return Math.sqrt((ax-bx)*(ax-bx) + (ay-by)*(ay-by));
	}
	
	boolean ok(int y, int x){
		return x>=0 && y>=0 && x<w && y<h;
	}
	
}