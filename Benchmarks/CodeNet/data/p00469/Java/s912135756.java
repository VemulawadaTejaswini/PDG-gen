import java.util.*;

public class Main {
	static HashMap<String,Boolean> map = new HashMap<String,Boolean>();
	static int[] list;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			if(n == 0 && k == 0) break;
			map.clear();
			list = new int[n];
			for(int i = 0; i < n; i++) {
				list[i] = sc.nextInt();
			}
			dfs(0,new StringBuilder(),new boolean[n],k);
			System.out.println(map.size());
		}
	}
	static void dfs(int a, StringBuilder b, boolean[] c, int d) {
		if(a == d) {
			map.put(b.toString(), true);
			return;
		}
		for(int i = 0; i < c.length; i++) {
			if(c[i]) continue;
			b = b.append(String.valueOf(list[i]));
			c[i] = true;
			dfs(a+1,b,c,d);
			c[i] = false;
			b = b.deleteCharAt(b.length()-1);
			if(list[i] >= 10) b = b.deleteCharAt(b.length()-1);
		}
	}
	
}