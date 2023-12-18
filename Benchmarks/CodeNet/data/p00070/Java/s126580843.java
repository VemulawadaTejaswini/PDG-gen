import java.util.*;

public class Main{
	int ans = 0, n, s;
	boolean [] used;
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		used = new boolean[10];
		while(sc.hasNext()){
			n = sc.nextInt();
			s = sc.nextInt();
			ans = 0;
			Arrays.fill(used, false);
			dfs(0,-1 * s);
			System.out.println(ans);
		}
	}
	
	private void dfs(int deep,int sum) {
		
		for(int i = 9; i >= 0; i--){
			if(! used[i]){
				int value = i * (n - deep);
				if(sum + value < 0){
					used[i] = true;
					dfs(deep + 1, value + sum);
					used[i] = false;
				}
				else if(sum + value == 0 && deep + 1 == n){
					ans++;
				}
			}
		}
	}

	private void debug(Object... o) { System.out.println("debug = " + Arrays.deepToString(o)); }

	public static void main(String[] args) {
		new Main().doit();
	}
}