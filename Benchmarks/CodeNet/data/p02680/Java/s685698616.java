import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	static class VLine{
		long sx;
		long ex;
		long y;
		VLine(int a , int b , int y){
			sx = Math.min(a, b);
			ex = Math.max(a, b);
			this.y = y;
		}		
	}
	static class HLine{
		long sy;
		long ey;
		long x;
		HLine(int a , int b , int x){
			sy = Math.min(a, b);
			ey = Math.max(a, b);
			this.x = x;
		}
	}
	
	static long[] getXgrid(VLine vs[] , HLine hs[]){
		TreeSet<Long> xs = new TreeSet<Long>();
		xs.add(0L);
		for(VLine v : vs){
			xs.add(v.sx);
			xs.add(v.ex);
		}
		for(HLine h : hs){
			xs.add(h.x);
		}
		long ret[] = new long[xs.size()];
		int cnt = 0;
		for(long x : xs){
			ret[cnt++] = x;
		}		
		return ret;
	}
	static long[] getYgrid(VLine vs[] , HLine hs[]){
		TreeSet<Long> ys = new TreeSet<Long>();
		ys.add(0L);
		for(VLine v : vs){
			ys.add(v.y);
		}
		for(HLine h : hs){
			ys.add(h.sy);
			ys.add(h.ey);
		}
		long ret[] = new long[ys.size()];
		int cnt = 0;
		for(long y : ys){
			ret[cnt++] = y;
		}		
		return ret;
	}

	static long moveArea(VLine vs[] , HLine hs[]){
		long result = 0;
		long xs[] = getXgrid(vs, hs);
		long ys[] = getXgrid(vs, hs);
		int vis[][] = new int[ys.length - 1][xs.length - 1];
		int xstart = Arrays.binarySearch(xs, 0);
		int ystart = Arrays.binarySearch(ys, 0);
		if(xstart == 0 || ystart == 0 || xstart == xs.length - 1 || ystart == ys.length - 1){
			return -1;
		}
		return result;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		VLine vs[] = new VLine[N];
		for(int i = 0 ; i < N ; ++i){
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			vs[i] = new VLine(a, b, c);
		}
		HLine hs[] = new HLine[M];
		for(int j = 0 ; j < M ; ++j){
			int d = sc.nextInt();
			int e = sc.nextInt();
			int f = sc.nextInt();
			hs[j] = new HLine(e , f , d);
		}
		sc.close();
		long ret = moveArea(vs, hs);
		if(ret < 0){
			System.out.println("INF");						
		}else{
			System.out.println(ret);			
		}
	}
}
