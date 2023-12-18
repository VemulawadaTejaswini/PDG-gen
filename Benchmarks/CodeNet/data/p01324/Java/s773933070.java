
import java.util.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;


public class Main {
	
	int n;
	String[] strs;
	HashMap<String, Integer> map;
	String[] ind2str;
	int NONVAL = -(1<<28);
	int[][] d;
	void run() {
		Scanner sc = new Scanner(System.in);
		
		for(;;) {
			n = sc.nextInt();sc.nextLine();
			if(n ==0 ) break;
			strs = new String[n];
			map = new HashMap<String, Integer>();
			for(int i=0;i<n;i++) strs[i] = sc.nextLine();
			
			int p = 0;
			for(String str: strs) {
				String[] sp = str.split(" ");
				if(!map.containsKey(sp[1])) map.put(sp[1], p++);
				if(!map.containsKey(sp[4])) map.put(sp[4], p++);
			}
			int size = map.size();
			d = new int[size][size];
			for(int[] a: d) fill(a, NONVAL);
			for(String str: strs) {
				String[] sp = str.split(" ");
				d[map.get(sp[1])][map.get(sp[4])] = Integer.parseInt(sp[3].substring(3));
				d[map.get(sp[4])][map.get(sp[1])] = -Integer.parseInt(sp[3].substring(3));
			}
			
			n = size;
			for(int i=0;i<n;i++) d[i][i] = 0;
			
//			debug(d);
			
			boolean flg = true;
			for(int i=0;i<n;i++) {
				used = new boolean[n];
				dfs(i, 0, i);
			}
			for(int i=0;i<n;i++) for(int j=0;j<n;j++) if( d[i][j] != -d[j][i] )flg = false;
//			for(int[] a: d) debug(a);
			System.out.println((flg? "Yes": "No"));
		}
		
	}
	
	boolean flg;
	boolean[] used;
	void dfs(int i, int v, int r) {
		used[i] = true;
		for(int j=0;j<n;j++) if( d[i][j] != NONVAL) {
			if(d[r][j] == NONVAL) {
				d[r][j] = d[i][j] + v;
			}
			if(!used[j]) dfs(j, v + d[i][j], r);
		}
	}
	
	void debug(Object...os) {
		System.err.println(deepToString(os));
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}