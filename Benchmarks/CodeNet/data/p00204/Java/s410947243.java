import java.util.Scanner;

//UFO Shooting Down Operation
public class Main{

	double dot(double[] a, double[] b){
		return a[0]*b[0]+a[1]*b[1];
	}
	
	void adv(double[] a){
		double norm = Math.hypot(a[0], a[1]);
		double dx = -a[0]/norm;
		double dy = -a[1]/norm;
		a[0] += dx*a[3];
		a[1] += dy*a[3];
	}
	
	void run(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int R = sc.nextInt();
			int n = sc.nextInt();
			if((R|n)==0)break;
			double[][] ufo = new double[n][4];
			for(int i=0;i<n;i++)for(int j=0;j<4;j++)ufo[i][j]=sc.nextDouble();
			for(int i=0;i<n;i++)adv(ufo[i]);
			boolean[] u = new boolean[n];
			int c = 0;
			while(true){
				double min = 1<<20;
				int id = -1;
				for(int i=0;i<n;i++){
					if(u[i])continue;
					double d = Math.hypot(ufo[i][0], ufo[i][1]);
					if(d<=R){
						u[i] = true;
						c++;
					}
					else if(d<min){
						min = d;
						id = i;
					}
				}
				if(id==-1)break;
				double[] p = {ufo[id][0], ufo[id][1]};
				for(int i=0;i<n;i++){
					if(u[i])continue;
					double[] ci = {ufo[i][0], ufo[i][1]};
					double A = dot(p, p);
					double B = -2*dot(p, ci);
					double C = dot(ci, ci)-ufo[i][2]*ufo[i][2];
					double D = B*B-4*A*C;
					if(D>=0){
						double t1 = (-B-Math.sqrt(D))/(2*A);
						double t2 = (-B+Math.sqrt(D))/(2*A);
						if(t1>=0||t2>=0)u[i] = true;
					}
					adv(ufo[i]);
				}
			}
			System.out.println(c);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}