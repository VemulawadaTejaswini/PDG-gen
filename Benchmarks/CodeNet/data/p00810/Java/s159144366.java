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
				int id = -1;
				for(int i=0;i<n;i++){
					double d = Math.sqrt((x[i]-px)*(x[i]-px) + (y[i]-py)*(y[i]-py) + (z[i]-pz)*(z[i]-pz));
					if(d < min){
						min = d;
					}
					if(max < d){
						id = i; max = d;
					}
				}
				if(Math.abs(min-max)<EPS){
					res = min; break;
				}
				double dt = (max-min)/2;
				double dx = x[id]-px, dy = y[id]-py, dz = z[id]-pz, D = Math.sqrt(dx*dx+dy*dy+dz*dz);
				dx = dx/D * dt;
				dy = dy/D * dt;
				dz = dy/D * dt;
				px+=dx; py+=dy; pz+=dz;
			}
			System.out.printf("%.5f\n", res);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}