import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		FastScanner fs=new FastScanner();
		int w=fs.nextInt(), h=fs.nextInt();
		int n=fs.nextInt();
		int[] xs=new int[n];
		int[] ys=new int[n];
		HashSet<Long> points=new HashSet<>();
		int[] onX=new int[w+1], onY=new int[h+1];
		for (int i=0; i<n; i++) {
			xs[i]=fs.nextInt();
			ys[i]=fs.nextInt();
			points.add(hash(xs[i], ys[i]));
			onX[xs[i]]++;
			onY[ys[i]]++;
		}
		int maxX=0, maxY=0;
		for (int x=0; x<=w; x++) maxX=Math.max(maxX, onX[x]);
		for (int y=0; y<=h; y++) maxY=Math.max(maxY, onY[y]);
		ArrayList<Integer> candidateXs=new ArrayList<>();
		ArrayList<Integer> candidateYs=new ArrayList<>();
		for (int x=0; x<w; x++)
			if (onX[x]==maxX) candidateXs.add(x);
		for (int y=0; y<h; y++)
			if (onY[y]==maxY) candidateYs.add(y);
		int ans=maxX+maxY-1;
		outer: for (int x:candidateXs) {
			for (int y:candidateYs) {
				if (!points.contains(hash(x, y))) {
					ans++;
					break outer;
				}
			}
		}
		
		System.out.println(ans);
	}

	static long hash(int x, int y) {
		return x*1_000_000_000l+y;
	}
	
	static final Random random=new Random();
	
	static void ruffleSort(int[] a) {
		int n=a.length;//shuffle, then sort 
		for (int i=0; i<n; i++) {
			int oi=random.nextInt(n), temp=a[oi];
			a[oi]=a[i]; a[i]=temp;
		}
		Arrays.sort(a);
	}
	
	static class FastScanner {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer("");
		String next() {
			while (!st.hasMoreTokens())
				try {
					st=new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			return st.nextToken();
		}
		
		int nextInt() {
			return Integer.parseInt(next());
		}
		int[] readArray(int n) {
			int[] a=new int[n];
			for (int i=0; i<n; i++) a[i]=nextInt();
			return a;
		}
		long nextLong() {
			return Long.parseLong(next());
		}
	}

	
}
