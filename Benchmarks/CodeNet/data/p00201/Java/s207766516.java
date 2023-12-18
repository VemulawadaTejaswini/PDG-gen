import java.util.*;
import java.util.Map.Entry;

import static java.util.Arrays.*;
import static java.lang.Math.*;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static int n,m;
	static Map<String, Integer> ip;
	static Map<String, String[]> recipe;
	static String query;
	static final int INF = 999999999;
	
	static boolean read() {
		n = sc.nextInt();
		if(n == 0) return false;
		
		ip = new HashMap<String, Integer>();
		for(int i = 0; i < n; i++)  ip.put(sc.next(), sc.nextInt());
		
		m = sc.nextInt();
		recipe = new HashMap<String, String[]>();
		int k;
		String o;
		String[] q;
		for(int i = 0; i < m; i++) {
			o = sc.next();
			k = sc.nextInt();
			q = new String[k];
			for(int j = 0; j < k; j++) {
				q[j] = sc.next();
				
			}
			recipe.put(o, q);
		}
		
		query = sc.next();
		return true;
	}
	
	static void solve() {
		System.out.println(rec(query));
	}
	
	static int rec(String item) {
		int value = ip.get(item);
		if(!recipe.containsKey(item)) return value;
		
		int tmp = 0;
		String[] items = recipe.get(item);
		for(int i = 0; i < items.length; i++) {
			tmp += rec(items[i]);
		}
		
		ip.put(item, min(value, tmp));
		return Math.min(value, tmp);
	}
	
	public static void main(String[] args) {
		while(read()) solve();
	}
}