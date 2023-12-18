import java.util.Arrays;
import java.util.Scanner;



public class Main {
	
	int nap[];
	int target = 10;
	int max_depth;
	
	void dfs(int g, int depth){
		if(g==target){
			if(max_depth < depth){
				max_depth = depth;
			}
		}
		for(int i=0; i<nap.length; ++i){
			if(0<nap[i]){	//とったやつは-1にwriteしている
				int tmp = nap[i];
				if(10<g+tmp){break;}	//sortしたから
				nap[i] = -1;
				dfs(g+tmp, depth+1);
				nap[i] = tmp;
			}
		}
	}
	
	int solve(){
		dfs(0, 0);
		return max_depth;
	}
	
	void io(){
		java.util.Scanner sc = new Scanner(System.in);
		while(true){
			final int n = sc.nextInt();
			if(n==0){ break; }
			nap = new int[n];
			max_depth=0;
			for(int i=0; i<n; ++i){
				nap[i] = sc.nextInt();
			}
			Arrays.sort(nap);
			System.out.println(solve());
		}
	}
	
	public static void main(String[] args) {
		new Main().io();
	}
}