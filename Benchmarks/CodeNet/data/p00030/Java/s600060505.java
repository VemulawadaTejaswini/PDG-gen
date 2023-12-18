import java.util.*;
public class Main {
	int n,s,ans;
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			n = sc.nextInt();
			s = sc.nextInt();
			if((n|s) == 0) break;
			ans = 0;
			dfs(0,0,-1);
			System.out.println(ans);
		}
	}
	
	private void dfs(int deep, int sum, int preb){
		if(deep == n){
			if(sum == s) ans++;
			return;
		}
		if(sum > s) return;
		for(int i=preb+ 1; i < 10; i++){
			int nextsum = sum + i;
			dfs(deep + 1, nextsum, i);
		}
	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();
	}
}