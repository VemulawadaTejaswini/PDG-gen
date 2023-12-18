import java.util.*;
import static java.util.Arrays.*;
import static java.lang.Math.*;
public class Main {
	static private int Q ;
	static private int q_cnt=0;
	static private int X,Y,W,H;
	static private int N;
	static private int[] neko_x;
	static private int[] neko_y;
	static private int neko_cnt = 0;
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		Q = sc.nextInt();

		while (read())
			solve();
	}
	
	static boolean read() {
		neko_cnt = 0;
		if(q_cnt == Q) { return false; }
		X = sc.nextInt();
		Y = sc.nextInt();
		W = sc.nextInt();
		H = sc.nextInt();
		N = sc.nextInt();
		neko_x = new int[N];			
		neko_y = new int[N];
		for(int j=0; j < N; j++) {
			neko_x[j] = sc.nextInt();
			neko_y[j] = sc.nextInt();
		}
		return true;
	}

	static void solve() {
		for(int i = 0; i < N; i++) {
			if(X <= neko_x[i] && X + W >= neko_x[i] && Y <= neko_y[i] && Y+H >= neko_y[i]) {
				neko_cnt++;
			}			
		}
		System.out.println(neko_cnt);
		q_cnt++;
	}	
}