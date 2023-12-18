
import java.util.Arrays;
import java.util.Scanner;

/**
 * AOJ id=0153
 * Triangle and Circle
 * @author scache
 *
 */
public class Main0153 {
	public static void main(String[] args) {
		Main0153 p = new Main0153();
	}

	public Main0153() {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int[] x = new int[3];
			int[] y = new int[3];
			for(int i=0;i<3;i++){
				x[i] = sc.nextInt();
				y[i] = sc.nextInt();
				if(i==0 && x[i]==0 && y[i]==0)
					return;
			}
			int rx = sc.nextInt();
			int ry = sc.nextInt();
			int r = sc.nextInt();
			
			System.out.println(solve(x, y, rx, ry, r));
		}
	}

	private String solve(int[] x, int[] y, int rx, int ry, int r) {
		int[] vx = new int[3];
		int[] vy = new int[3];
		
		
		for(int i=0;i<3;i++){
			vx[i] = x[(i+1)%3]-x[i];
			vy[i] = y[(i+1)%3]-y[i];
		}
		
		int inCircle = 0;
		for(int i=0;i<3;i++){
			int xd = (x[i]-rx)*(x[i]-rx);
			int yd = (y[i]-ry)*(y[i]-ry);
			if(r*r >= xd+yd)
				inCircle++;
		}
		if(inCircle==3)
			return "b";
//		else if(inCircle==1 || inCircle==2)
//			// 接している場合は三角形の中に円がはいっている可能性がある？
//			return "c";
		

		int l=0;
		for(int i=0;i<3;i++){
			if(vx[i]*(ry-y[i])-(rx-x[i])*vy[i]<0)
				l++;
		}
		if(l==3 || l==0)
			return "a";
		
		
		for(int i=0;i<3;i++){
			int vrx = rx-x[i];
			int vry = ry-y[i];
			
			int inp = vx[i]*vrx+vy[i]*vry;
			if(inp<0){
				if(vrx*vrx+vry*vry < r*r)
					return "c";
			}else{
				if(inp > vx[i]*vx[i]+vy[i]*vy[i]){
					if((rx-x[(i+1)%3])*(rx-x[(i+1)%3])+(ry-y[(i+1)%3])*(ry-y[(i+1)%3]) <r*r)
						return "c";
				}else{
					if(vrx*vrx+vry*vry-inp*inp < (long)(vx[i]*vx[i]+vy[i]*vy[i])*r*r){
						return "c";
					}
				}
			}
		}
		
		return "d";
		
		
	}
}