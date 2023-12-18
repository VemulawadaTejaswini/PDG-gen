import java.util.Arrays;
import java.util.Scanner;

//Walking Santa
public class Main{

	void run(){
		Scanner sc = new Scanner(System.in);
		sc.nextInt(); sc.nextInt();
		int n = sc.nextInt();
		int[] x = new int[n], y = new int[n];
		int[][] pos = new int[n][2];
		for(int i=0;i<n;i++){
			pos[i][0] = x[i] = sc.nextInt(); pos[i][1] = y[i] = sc.nextInt();
		}
		Arrays.sort(x); Arrays.sort(y);
		int rx = x[0], ry = y[0];
		long sx = 0, sy = 0, mx = 0, my = 0;
		for(int i=1;i<n;i++){
			sx += x[i]-x[0]; sy += y[i]-y[0];
			mx = 2*sx-x[n-1]+x[0]; my = 2*sy-y[n-1]+y[0];
		}
		for(int i=1;i<n;i++){
			int dx = x[i]-x[i-1], dy = y[i]-y[i-1];
			sx = sx-(n-i)*dx+i*dx;
			sy = sy-(n-i)*dy+i*dy;
			long nx = 2*sx-Math.max(x[n-1]-x[i], x[i]-x[0]), ny = 2*sy-Math.max(y[n-1]-y[i], y[i]-y[0]);
			if(nx<mx){
				mx = nx; rx = x[i];
			}
			if(ny<my){
				my = ny; ry = y[i];
			}
		}
		long res = 0, max = 0;
		for(int i=0;i<n;i++){
			res += 2*(Math.abs(x[i]-rx)+Math.abs(y[i]-ry));
			max = Math.max(max, Math.abs(pos[i][0]-rx)+Math.abs(pos[i][1]-ry));
		}
		System.out.println((res-max)+"\n"+rx+" "+ry);
	}
	
	void debug(Object...o){
		System.out.println(Arrays.deepToString(o));
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}