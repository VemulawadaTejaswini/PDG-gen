import java.util.Scanner;

//Super Star
public class Main{

	void run(){
		Scanner sc = new Scanner(System.in);
		double EPS = 1e-5;
		for(;;){
			int n = sc.nextInt();
			if(n==0)break;
			double[] x = new double[n], y = new double[n], z = new double[n];
			double px = 0, py = 0, pz = 0;
			for(int i=0;i<n;i++){
				x[i] = sc.nextDouble();
				y[i] = sc.nextDouble();
				z[i] = sc.nextDouble();
				px+=x[i];
				py+=y[i];
				pz+=z[i];
			}
			px/=n; py/=n; pz/=n;
			double res = 0;
			for(;;){
				double min = 1<<29, max = -1;
				int mi = -1, ma = -1;
				for(int i=0;i<n;i++){
					double d = Math.sqrt((x[i]-px)*(x[i]-px) + (y[i]-py)*(y[i]-py) + (z[i]-pz)*(z[i]-pz));
					if(d < min){
						mi = i; min = d;
					}
					if(max < d){
						ma = i; max = d;
					}
				}
				if(Math.abs(min-max)<EPS){
					res = min; break;
				}
				double dx = x[ma]-px, dy = y[ma]-py, dz = z[ma]-pz, D = Math.sqrt(dx*dx+dy*dy+dz*dz);
				dx = dx/D;
				dy = dy/D;
				dz = dy/D;
				double L = 0, R = max;
				for(int k=0;k<50;k++){
					double m = (L+R)/2;
					double nx = px+dx*m, ny = py+dy*m, nz = pz+dz*m;
					double dmin = Math.sqrt((x[mi]-nx)*(x[mi]-nx) + (y[mi]-ny)*(y[mi]-ny) + (z[mi]-nz)*(z[mi]-nz));
					double dmax = Math.sqrt((x[ma]-nx)*(x[ma]-nx) + (y[ma]-ny)*(y[ma]-ny) + (z[ma]-nz)*(z[ma]-nz));
					if(dmin < dmax)L=m;
					else R=m;
				}
				px+=dx*L;
				py+=dy*L;
				pz+=dz*L;
			}
			System.out.printf("%.5f\n", res);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}