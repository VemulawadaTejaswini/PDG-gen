
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().run();
	}

	ArrayList<Integer>[] G;
	int n;
	int[] color;

	private void run() {
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		int m = scanner.nextInt();
		G = new ArrayList[n];
		color = new int[n];
		for (int i = 0; i < n; i++) {
			G[i] = new ArrayList<Integer>();
		}
		for (int i = 0; i < m; i++) {
			int s = scanner.nextInt();
			int t = scanner.nextInt();
			G[s].add(t);
			G[t].add(s);
		}
		assiginColor();
		
		int q = scanner.nextInt();
		for(int i=0;i<q;i++){
			int s = scanner.nextInt();
			int t = scanner.nextInt();
			if(color[s]==color[t]){
				System.out.println("yes");
			}else{
				System.out.println("no");
			}
		}
	}

	private void assiginColor() {
		Arrays.fill(color, -1);
		int id = 1;
		for (int i = 0; i < n; i++) {
			if (color[i] == -1)
				dfs(i, id++);
		}
	}

	private void dfs(int r, int c) {
		Deque<Integer> deque = new ArrayDeque<Integer>();
		deque.push(r);
		color[r] = c;
		while(!deque.isEmpty()){
			int u = deque.poll();
			for(int i = 0;i<G[u].size();i++){
				int v = G[u].get(i);
				if(color[v]==-1){
					color[v] = c;
					deque.push(v);
				}
			}
		}
	}
}