import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main
{
	private static void solve(FastScanner fr) {
		int n = fr.nextInt();
		int m = fr.nextInt();
		Map<Integer, Set<Integer>> group = new HashMap<>();
		int max = 1;
		for(int i=0; i<m; i++) {
			int a = fr.nextInt();
			int b = fr.nextInt();
			Set<Integer> ag = group.get(a);
			Set<Integer> bg = group.get(b);
			if(ag==null && bg==null){
				Set<Integer> set = new HashSet<>();
				set.add(a);
				set.add(b);
				group.put(a, set);
				group.put(b, set);			
			} else if(ag==null && bg!=null){
				bg.add(a);
				group.put(a, bg);
			} else if(ag!=null && bg==null){
				ag.add(b);
				group.put(b, ag);
			} else if(ag!=null && bg!=null){
				if(ag!=bg) {
					Set<Integer> bigger = ag.size()>bg.size() ? ag : bg;
					Set<Integer> smaller = ag.size()>bg.size() ? bg : ag;
					for(int v : smaller) {
						group.put(v, bigger);
						bigger.add(v);
					}
				}
			}
			max = Math.max(max, group.get(a).size());
		}
		sout(max);
	}
    public static void main(String[] args) {
		FastScanner fs = new FastScanner();
		int n = 1;
		// int n = fs.nextInt();
		while (n-- > 0)	{
			solve(fs);
        }
    }

    private static void sout()          { System.out.println();  }
    private static void sout(String s)  { System.out.println(s); }
    private static void sout(int s)     { System.out.println(s); }
    private static void sout(long s)    { System.out.println(s); }
    private static void sout(double s)  { System.out.println(s); }
    
	static class FastScanner {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer("");
		String next() {
			while (!st.hasMoreTokens())
				try { st=new StringTokenizer(br.readLine()); } catch (IOException e) { e.printStackTrace(); }
			return st.nextToken();
		}
		int[] readArray(int n) {
			int[] a=new int[n];
			for (int i=0; i<n; i++) a[i]=nextInt();
			return a;
		}
		int nextInt() {	return Integer.parseInt(next()); }
		long nextLong() { return Long.parseLong(next()); }
		double nextDouble() { return Double.parseDouble(next()); }
	}
}
