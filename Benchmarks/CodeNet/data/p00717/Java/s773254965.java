import java.util.*;
import static java.lang.System.*;

public class Main {

	Scanner sc = new Scanner(in);
	
	int dis(int x1, int y1, int x2, int y2) {
		return (x1 == x2) ? Math.abs(y1-y2) : Math.abs(x1-x2);
	}
	
	
	void calc(int m, int[] dis, boolean[] dir) {
		int prex = sc.nextInt(), prey = sc.nextInt();
		int nextx = sc.nextInt(), nexty = sc.nextInt();
		dis[0] = dis(prex, prey, nextx, nexty);
		int vorh;
		if (prex == nextx) {
			if (prey < nexty) vorh = 1; //↑
			else vorh = 2;              //↓
		} else {
			if (prex < nextx) vorh = 3; //→
			else vorh = 4;              //←
		}
		prex = nextx;
		prey = nexty;
		
		
		for (int i = 2; i < m; i++) {
			nextx = sc.nextInt();
			nexty = sc.nextInt();
			dis[i-1] = dis(prex, prey, nextx, nexty);
			switch (vorh) {
			case 1: if (prex < nextx) { dir[i-2] = true; vorh = 3; break;}
					else { dir[i-2] = false; vorh = 4; break;}
			case 2: if (prex < nextx) { dir[i-2] = false; vorh = 3; break;} 
					else { dir[i-2] = true; vorh = 4; break;}
			case 3: if (prey < nexty) { dir[i-2] = false; vorh = 1; break;} 
					else { dir[i-2] = true; vorh = 2; break;}
			case 4: if (prey < nexty) { dir[i-2] = true; vorh = 1; break;} 
					else { dir[i-2] = false; vorh = 2; break;}
			}
			prex = nextx;
			prey = nexty;
		}
	}
	
	void run() {
		int n ;
		while (true) {
			n = sc.nextInt();
			if (n == 0) break;
			int m0 = sc.nextInt();
			int[] dis0 = new int[m0-1];
			boolean[] dir0 = new boolean[m0-2]; // true:right   left:false
			calc(m0, dis0, dir0);
			
			
			for (int i = 1; i <= n; i++) {
				int m = sc.nextInt();
				int[] dis = new int[m-1];
				boolean[] dir = new boolean[m-2]; // true:right   left:false
				calc(m, dis, dir);
				if (m0 == m) {
					boolean flag = true;
					for (int j = 0; j < m-1; j++) {
						if (dis0[j] != dis[j]) {
							flag = false;
							break;
						}
					}
					for (int j = 0; j < m-2; j++) {
						if (dir0[j] != dir[j]) {
							flag = false;
							break;
						}
					}
					boolean rflag = true;
					for (int j = 0; j < m-1; j++) {
						if (dis0[j] != dis[m-j-2]) {
							rflag = false;
							break;
						}
					}
					for (int j = 0; j < m-2; j++) {
						if (dir0[j] == dir[m-j-3]) {
							rflag = false;
							break;
						}
					}
					if (flag || rflag)
						out.println(i);
				}
			}
			
			out.println("+++++");
		}
		
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}