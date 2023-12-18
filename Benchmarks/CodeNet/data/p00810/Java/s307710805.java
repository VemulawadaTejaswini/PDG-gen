import java.util.Scanner;

public class Main {

	static int N;
	static final double EPS = 1e-8;
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		for(;;){
			N=cin.nextInt();
			if(N==0)break;
			double[][] p=new double[N][3];
			for(int i=0;i<N;i++){
				for(int j=0;j<3;j++){
					p[i][j]=cin.nextDouble();	
				}
			}
			double[] s=smallestSphere(p);
			double ans=-1;
			for(int i=0;i<N;i++){
				ans=Math.max(ans,dist(s,p[i]));
			}
			System.out.printf("%.5f\n",ans);
		}
	}
	static double dist(double[] a,double[] b){
		double re=0;
		for(int i=0;i<3;i++){
			re+=Math.pow(a[i]-b[i],2.0);
		}
		
		return Math.sqrt(re);
	}
	
	static double[] smallestSphere(double[][] p){
		int n = p.length;
		double[] pos = new double[3];
		for(int i=0;i<n;i++)for(int j=0;j<3;j++)pos[j]+=p[i][j];
		for(int j=0;j<3;j++)pos[j]/=n;
		double ratio = 0.5;
		while(ratio > EPS){
			for(int t=0;t<50;t++){
				double max = -1;
				int id = -1;
				for(int i=0;i<n;i++){
					double d = 0;
					for(int j=0;j<3;j++)d+=(pos[j]-p[i][j])*(pos[j]-p[i][j]);
					if(max < d){
						max = d; id = i;
					}
				}
				double dx = p[id][0]-pos[0], dy = p[id][1]-pos[1], dz = p[id][2]-pos[2];
				pos[0]+=dx*ratio;
				pos[1]+=dy*ratio;
				pos[2]+=dz*ratio;
			}
			ratio/=2;
		}
		return pos;
	}
}