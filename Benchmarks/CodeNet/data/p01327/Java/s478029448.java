import java.util.*;
import static java.lang.Math.*;

public class Main {

	class Star{
		double x, y, z;
		Star(double _x, double _y, double _z){
			this.x = _x;
			this.y = _y;
			this.z = _z;
		}
		Star(double theta, double phi){
			this.x = cos(theta)*cos(phi);
			this.y = sin(theta)*cos(phi);
			this.z = sin(phi);
		}
		Star rotAround(Star n, double th){
			double nx = (n.x*n.x*(1-cos(th)) + cos(th))*this.x
						+ (n.x*n.y*(1-cos(th)) - n.z*sin(th))*this.y
						+ (n.z*n.x*(1-cos(th)) + n.y*sin(th))*this.z,
					ny = (n.x*n.y*(1-cos(th)) + n.z*sin(th))*this.x
						+ (n.y*n.y*(1-cos(th)) + cos(th))*this.y
						+ (n.y*n.z*(1-cos(th)) - n.x*sin(th))*this.z,
					nz = (n.z*n.x*(1-cos(th)) - n.y*sin(th))*this.x
						+ (n.y*n.z*(1-cos(th)) + n.x*sin(th))*this.y
						+ (n.z*n.z*(1-cos(th)) + cos(th))*this.z;
			return new Star(nx,ny,nz);
		}
	}

	Star NorthStar = new Star(PI, 43.2*PI/180.0);
	int[] month = {0,31,29,31,30,31,30,31,31,30,31,30,31};

	void run(){
		Scanner in = new Scanner(System.in);
		in.useDelimiter("[/:\\s]");
		int T = in.nextInt();
		while(T-- > 0){
			int mon = in.nextInt();
			int day = in.nextInt();
			int hour = in.nextInt();
			int min = in.nextInt();
			for(int i=0; i<mon; i++){
				day += month[i];
			}
			day--;
			min += (day*24+hour)*60;
			double angle = min*(1.0 + 1.0/365.24)*2*PI/60.0/24.0;
			int n = in.nextInt();
			for(int i=0; i<n; i++){
				String name = in.next();
				int m = in.nextInt();
				boolean canSee = true;
				for(int j=0; j<m; j++){
					double a = in.nextDouble(), h = in.nextDouble();
					Star st = new Star((180-a)*PI/180.0,h*PI/180.0);
					st = st.rotAround(NorthStar, -angle);
					if(st.z < 0) canSee = false;
				}
				if(canSee){
					System.out.println(name);
				}
			}
		}
	}

	public static void main(String args[]){
		new Main().run();
	}
}