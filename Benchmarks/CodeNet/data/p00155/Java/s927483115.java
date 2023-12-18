import java.io.PrintWriter;
import java.util.Scanner;
import static java.lang.Math.*;

public class Main {

	static double[] d;
	static double[][] cost;
	static short n;
	static final double INF = Double.MAX_VALUE;
	static short[] x,y;

	public static void main(String[] args) {

		PrintWriter out = new PrintWriter(System.out);
		Scanner scan = new Scanner(System.in);
		while(true){
			n = scan.nextShort();
			if(n==0) break;
			x = new short[n];
			y = new short[n];
			for (int i = 0; i < n; i++) {
				scan.next();
				x[i] = scan.nextShort();
				y[i] = scan.nextShort();
			}
			cost = new double[n][n];
			for (int i = 0; i < n; i++) {
				for (int j = i+1; j < n; j++) {
					cost[j][i]=cost[i][j] = sqrt(pow(x[i]-x[j],2)+pow(y[i]-y[j],2));
					if(cost[i][j]>50) cost[j][i]= cost[i][j] = INF;
				}
			}
			short m = scan.nextShort();
			while(m-->0){
				out.println(dk(scan.nextShort()-1,scan.nextShort()-1));
			}
		}
		out.flush();
	}

	public static String dk(int s,int g){
		d = new double[n];
		for (int i = 0; i < n; i++) d[i] = INF;
		d[s] = 0;
		short[] prev = new short[n];
		prev[s] = -1;
		boolean[] used = new boolean[n];
		while(true){
			short v = -1;
			for (short i = 0; i < n; i++) {
				if(!used[i] && (v==-1 || d[i]<d[v])) v = i;
			}
			if(v==-1) break;
			used[v]=true;
			for (short i = 0; i < n ; i++) {
				if(d[i]>d[v]+cost[v][i]){
					prev[i] = v;
					d[i] = d[v]+cost[v][i];
				}
			}
		}

		if(d[g]==INF) return "NA";

		String ans = String.valueOf(g+1);
		int pos = prev[g];
		do{
			ans = (pos+1) + " " + ans;
			pos=prev[pos];
		}while(pos!=-1);
		return ans;
	}
}