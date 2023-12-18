import java.util.*;
import java.awt.geom.*;
import java.awt.geom.Line2D.Double;

public class Main {
	int[][] p = new int[4][4];
	double[] x = new double[3];
	double[] y = new double[3];
	
	boolean check(int u, int v){
		int y1 = p[u][1]-p[u][3];
		int x1 = p[u][0]-p[u][2];
		int y2 = p[v][1]-p[v][3];
		int x2 = p[v][0]-p[v][2];
		Line2D.Double t1 = new Line2D.Double(p[u][0],p[u][1],p[u][2],p[u][3]);
		Line2D.Double t2 = new Line2D.Double(p[v][0],p[v][1],p[v][2],p[v][3]);
		if(y1*x2==y2*x1 || !t1.intersectsLine(t2)){
			System.out.println("kyo");
			return true;
		}
		
		double a, b, c, d;
		if(x1==0){
			x[u] = p[u][0];
			a = (double)y2/x2;
			b = p[v][1] - a*p[v][0];
			y[u] = a*x[u]+b;
		}else if(x2==0){
			x[u] = p[v][0];
			a = (double)y1/x1;
			b = p[u][1] - a*p[u][0];
			y[u] = a*x[u]+b;
		}else{
			a = (double)y1/x1;
			b = p[u][1] - a*p[u][0];
			c = (double)y2/x2; 
			d = p[v][1] - a*p[v][0];
			x[u] = (d-b)/(a-c);
			y[u] = (a*d-b*c)/(a-c);
		}
		return false;
	}
	
	void run(){
		Scanner sc = new Scanner(System.in);
		
		while(true){
			for(int i=0;i<4;i++) p[0][i] = sc.nextInt();
			if(p[0][0]==0 && p[0][1]==0 && p[0][2]==0 && p[0][3]==0) break;
			for(int i=0;i<4;i++) p[1][i] = sc.nextInt();
			for(int i=0;i<4;i++) p[2][i] = sc.nextInt();
			if(check(0,1)) continue;
			if(check(1,2)) continue;
			if(check(2,0)) continue;
			double sum = Math.abs((x[1]-x[0])*(y[2]-y[0])-(y[1]-y[0])*(x[2]-x[1]))/2;
			String ans = "kyo";
			if(sum>=1900000) ans = "dai-kichi";
			else if(sum>=1000000) ans = "chu-kichi";
			else if(sum>=100000) ans = "kichi";
			else if(sum>=0) ans = "syo-kichi";
			System.out.println(ans);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();	
	}	
}