import java.util.*;

public class Main{
	Scanner sc = new Scanner(System.in);
	String [] name;
	int [] s,w;
	String ans;
	int n, value;
	boolean [] used;
	
	private void doit(){
		while(true){
			n = sc.nextInt();
			if(n == 0) break;
			name = new String[n];
			s = new int[n];
			w = new int[n];
			for(int i = 0; i < n; i++){
				name[i] = sc.next();
				w[i] = sc.nextInt();
				s[i] = sc.nextInt();
			}
			used = new boolean[n];
			ans = "";
			value = 1 << 24;
			dfs(0,0,0, new StringBuilder());
			for(int i = ans.length() - 1; i >= 0; i--){
				int ind = ans.charAt(i) - '0';
				System.out.println(name[ind]);
			}
		}
	}

	private void dfs(int deep, int wsum, int gsum,  StringBuilder order) {
		if(deep == n){
			if(gsum < value){
				value = gsum;
				ans = new String(order.toString());
			}
			return;
		}
		for(int i = 0; i < n;i++){
			if(! used[i] && s[i] >= wsum){
				used[i] = true;
				order.append(i);
				dfs(deep + 1, wsum + w[i], gsum + w[i] * (n - deep),order);
				order.deleteCharAt(order.length() - 1);
				used[i] = false;
			}
		}
	}

	private void debug(Object... o) { System.out.println("debug = " + Arrays.deepToString(o)); }

	public static void main(String[] args) {
		new Main().doit();
	}
}