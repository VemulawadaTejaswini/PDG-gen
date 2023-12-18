import java.util.*;
import java.awt.geom.*;
import static java.lang.Math.*;
public class Main {
	final Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		new Main().init();
	}
	void init(){
		new Q2000A();
	}
	
	class Q2000A{
		Q2000A(){
			SET = sc.nextInt();
			while(--SET>=0){
				solve();
			}
		}
		int SET,N;
		final double EPS = 0.05/100,
					EPS2 = 1.0e-10;
		void solve(){
			double[] len = new double[3];
			for(int i=0; i<3; ++i)	len[i]=sc.nextDouble();
			
			N=sc.nextInt();
			
			Point3D[] point=new Point3D[N];
			for(int i=0; i<N; ++i)	point[i]=new Point3D(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
			
			for(int p=0; p<N; ++p){
				for(int q=0; q<N; ++q){
					for(int r=0; r<N; ++r){
						double[] len2 = {	point[p].getDis(point[q]),
											point[q].getDis(point[r]),
											point[r].getDis(point[p]) };
						boolean flg=true;
						for(int i=0; i<3; ++i){
							double tmp1 = len[i]*len2[(i+1)%3],
									tmp2 = len[(i+1)%3]*len2[i];
							if(tmp1 < EPS2 || tmp2 < EPS2){
								flg=false;
								break;
							}
							if( !(max(tmp1,tmp2)/min(tmp1,tmp2) < 1.0+EPS)){
								flg = false;
								break;
							}
						}
						if(flg){
							System.out.println((r+1)+" "+(p+1)+" "+(q+1));
							return;
						}
					}
				}
			}
		}
		class Point3D{
			double x,y,z;
			Point3D(double x,double y,double z){
				this.x=x;	this.y=y;	this.z=z;
			}
			double getDis(Point3D a){
				double ret=0.0;
				double xd = a.x-x,
						yd = a.y-y,
						zd = a.z-z;
				ret = sqrt(xd*xd+yd*yd+zd*zd);
				return ret;
			}
		}
	}
}