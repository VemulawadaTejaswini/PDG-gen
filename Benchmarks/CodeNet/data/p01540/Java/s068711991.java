import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;


public class Main {
	static int N, M;
	static int[] TX, TY;
	static int[][] ZX, ZY;
			
	static private void solve()
	{
		TreeSet<Integer> tsx = new TreeSet<Integer>();
		TreeSet<Integer> tsy = new TreeSet<Integer>();
		for (int i = 0; i < N; i++) {
			tsx.add(new Integer(TX[i]));
			tsy.add(new Integer(TY[i]));
		}
		ArrayList<Integer> alx = new ArrayList<Integer>(tsx);
		ArrayList<Integer> aly = new ArrayList<Integer>(tsy);
		int tsw = tsx.size();
		int tsh = tsy.size();
		
		int[][] treasure = new int[tsy.size() + 1][tsx.size() + 1];
		for (int y = 0; y < tsh+1; y++) {
			for (int x = 0; x < tsw+1; x++) {
				treasure[y][x] = 0;
			}
		}
		for (int i = 0; i < N; i++) {
			int x = alx.indexOf(new Integer(TX[i]));
			int y = aly.indexOf(new Integer(TY[i]));
			treasure[y + 1][x + 1]++;
		}
		
		for (int y = 1; y <= tsh; y++) {
			for (int x = 1; x <= tsw; x++) {
				treasure[y][x] += treasure[y-1][x] + treasure[y][x-1] - treasure[y-1][x-1];
			}
		}
		
		for (int i = 0; i < M; i++) {
			Integer xx1 = tsx.ceiling(new Integer(ZX[i][0]));
			Integer xx2 = tsx.floor(new Integer(ZX[i][1]));
			Integer yy1 = tsy.ceiling(new Integer(ZY[i][0]));
			Integer yy2 = tsy.floor(new Integer(ZY[i][1]));
			
			if( xx1 == null || xx2 == null || yy1 == null || yy2 == null )
			{
				System.out.println("0");
				continue;
			}
			
			int x1 = alx.indexOf(xx1);
			int x2 = alx.indexOf(xx2) + 1;
			int y1 = aly.indexOf(yy1);
			int y2 = aly.indexOf(yy2) + 1;
			
			int ret = treasure[y2][x2] - treasure[y2][x1] - treasure[y1][x2] + treasure[y1][x1];
			System.out.println(ret);
		}
	}
	
	static public void main(String[] args)
	{
		Scanner sca = new Scanner(System.in);
		
		while(true)
		{
			N = sca.nextInt();
			M = sca.nextInt();
			
			TX = new int[N];
			TY = new int[N];
			for (int i = 0; i < N; i++) {
				TX[i] = sca.nextInt();
				TY[i] = sca.nextInt();
			}
			
			ZX = new int[M][2];
			ZY = new int[M][2];
			for (int i = 0; i < M; i++) {
				ZX[i][0] = sca.nextInt();
				ZY[i][0] = sca.nextInt();
				ZX[i][1] = sca.nextInt();
				ZY[i][1] = sca.nextInt();
			}
			
			solve();
			
			break;
		}
	}
}