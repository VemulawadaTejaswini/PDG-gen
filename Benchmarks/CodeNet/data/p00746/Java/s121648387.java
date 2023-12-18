import java.util.*;

public class Main {
	int [] vx = {-1,0,1,0};
	int [] vy = {0,1,0,-1};
	
	private void doit() {
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n == 0) break;
			int [] x = new int[n];
			int [] y = new int[n];
			for(int i = 1; i < n; i++){
				int ni = sc.nextInt();
				int d = sc.nextInt();
				x[i] = x[ni] + vx[d];
				y[i] = y[ni] + vy[d];
			}
			int maxx= x[0],maxy = y[0],minx = x[0],miny = y[0];
			for(int i=1; i < n; i++ ){
				maxx = Math.max(maxx, x[i]);
				maxy = Math.max(maxy, y[i]);
				minx = Math.min(minx, x[i]);
				miny = Math.min(miny,y[i]);
			}
			System.out.println((maxx - minx + 1) + " " + (maxy - miny + 1));
		}
		
	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();
	}
}