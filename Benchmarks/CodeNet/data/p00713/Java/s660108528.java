import java.util.*;

public class Main {
	public static void main(String[] args){
		new Main().calc();
	}

	double[] x;
	double[] y;
	int n;
	void calc(){
		Scanner cin = new Scanner(System.in);
		while(true){
			n = cin.nextInt();
			if(n==0) break;
			x = new double[n];
			y = new double[n];
			int i,j,k;
			for(i=0;i<n;i++){
				x[i] = cin.nextDouble();
				y[i] = cin.nextDouble();
			}
			int ret = 0;
			for(i=0;i<n;i++){
				ret = Math.max(ret, getmax(new int[]{i}));
				for(j=i+1;j<n;j++){
					if(Math.hypot(x[i]-x[j], y[i]-y[j]) > 2) continue;
					ret = Math.max(ret, getmax(new int[]{i,j}));
					for(k=j+1;k<n;k++){
						if(Math.hypot(x[k]-x[j], y[k]-y[j]) > 2) continue;
						if(Math.hypot(x[i]-x[k], y[i]-y[k]) > 2) continue;
						ret = Math.max(ret, getmax(new int[]{i,j,k}));
					}
				}
			}
			System.out.println(ret);
		}
	}

	int getmax(int[] nums){
		double nx = 0;
		double ny = 0;
		for(int a : nums){
			nx += x[a]/nums.length;
			ny += y[a]/nums.length;
		}
		double move = 0.7;
		for(int i=0;i<30;i++){
			double maxdist = 0;
			int num = 0;
			for(int a :nums){
				double dist = Math.hypot(nx-x[a], ny-y[a]);
				if(maxdist<dist){
					maxdist = dist;
					num = a;
				}
			}
			if(maxdist<1) break;
			nx += (x[num]-nx)*move;
			ny += (y[num]-ny)*move;
			move *= 0.7;
		}
		return getnum(nx,ny);
	}

	int getnum(double nx, double ny){
		int ret = 0;
		for(int i = 0;i <n;i++){
			if(Math.hypot(nx-x[i], ny-y[i])<=1) ret++;
		}
		return ret;
	}

}