import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	Scanner sc = new Scanner(System.in);
	int n;
	int[] num;
	public void run(){
		n = sc.nextInt();
		num = new int[10];
		for(int i = 0; i< n; i++){
			for(int k = 0; k < 10; k++){
				num[k] = sc.nextInt();
			}
			solve();
		}
	}
	public void solve(){
		if(dfs(0,0,0)) System.out.println("YES");
		else System.out.println("NO");
	}
	
	boolean dfs(int l, int r, int k){
		if(k == 10) return true;
		
		int now = num[k];
		boolean left = false;
		boolean right = false;
		if(now > l) left = dfs(now, r, k+1);
		if(now > r) right = dfs(l, now, k+1);
		
		return left || right;
	}
	
	public static void main(String[] args){
		new Main().run();
	}
	
	static class Pair {
        int first,second;
        public Pair(int a,int b) {
            this.first = a;
            this.second = b;
        }
    }	
}