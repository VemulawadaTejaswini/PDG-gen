import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

//String With Rings
public class Main{

	int n;
	List<Integer>[] adj;
	boolean[] v;

	boolean dfs(int k, int d, int T){
		if(d==T)return true;
		for(int x:adj[k])if(!v[x]){
			v[x] = true;
			if(dfs(x, d+1, T))return true;
			v[x] = false;
		}
		return false;
	}
	
	@SuppressWarnings("unchecked")
	void run(){
		Scanner sc = new Scanner(System.in);
		for(;;){
			n = sc.nextInt();
			if(n==0)break;
			adj = new List[101];
			for(int i=1;i<101;i++)adj[i]=new ArrayList<Integer>();
			Set<Integer> set = new HashSet<Integer>();
			while(n--!=0){
				int a = sc.nextInt(), b = sc.nextInt();
				set.add(a); set.add(b);
				adj[a].add(b); adj[b].add(a);
			}
			int res = 0;
			v = new boolean[101];
			int s = 0;
			for(int i=1;i<=set.size();i++){
				while(s<101&&!set.contains(s))s++;
				if(s==101)break;
				Arrays.fill(v, false);
				v[s] = true;
				if(dfs(s, 1, i)){
					res = i;
				}
				else {
					s++; i--;
				}
			}
			System.out.println(res);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}