import java.util.*;

public class Main {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			double[] x = new double[4];
			double[] y = new double[4];
			double[] vx = new double[6];
			double[] vy = new double[6];
			for(int i=0; i<4; i++){
				x[i] = in.nextDouble();
				y[i] = in.nextDouble();
			}
			for(int i=0; i<3; i++){
				vx[i] = x[(i+1)%3]-x[i];
				vy[i] = y[(i+1)%3]-y[i];
				vx[i+3] = x[3]-x[i];
				vy[i+3] = y[3]-y[i];
			}
			int check = 0;
			for(int i=0; i<3; i++){
				if(vx[i]*vy[i+3]-vx[i+3]*vy[i]>0) check++;
			}
			if(check == 0 || check == 3) System.out.println("YES");
			else System.out.println("NO");
		}
	}
}