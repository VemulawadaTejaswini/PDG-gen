import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	boolean [] used;
	boolean [][] pass;
	int len = 26;

	private void doit() {
		while (sc.hasNext()) {
			int n = sc.nextInt();
			if(n == 0) break;
			pass = new boolean[len][len];
			int [][] count = new int[len][2];
			for(int i = 0; i < n; i++){
				String s = sc.next();
				int first =  s.charAt(0) - 'a';
				int end = s.charAt(s.length()-1) - 'a';
				count[first][0]++;
				count[end][1]++;
				pass[first][end] = true;
			}
			
			boolean flg = true;
			for(int i = 0; i < len; i++){
				if(count[i][0] != count[i][1]){
					flg = false;
					break;
				}
			}
			if(! flg){
				System.out.println("NG");
				continue;
			}
			used = new boolean[len];
			int ind = -1;
			for(int i = 0; i < len; i++){
				if(count[i][0] > 0){
					ind = i;
					break;
				}
			}
			dfs(ind);
			boolean flg2 = true;
			for(int i = 0; i < len; i++){
				if(! used[i] && count[i][0] > 0){
					flg2 = false;
					break;
				}
			}
			System.out.println(flg2 ? "OK" : "NG");
		}
	}

	private void dfs(int ind) {
		used[ind] = true;
		for(int i = 0; i < len; i++){
			if(used[i]) continue;
			if(pass[ind][i]){
				dfs(i);
			}
		}
	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().doit();
	}
}