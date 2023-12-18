import java.util.ArrayList;
import java.util.Scanner;

class Main {
	static final long MOD = 1000000007;
	static Node[] node;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		node = new Node[N];
		
		for(int i = 0; i < N; i++) {
			node[i] = new Node();
			char[] in = scan.next().toCharArray();
			if(in[0] == 'E') {
				node[i].isE = true;
			}
			
			if(in[0] == 'A') {
				node[i].isA = true;
			}
			
			if(in[0] == 'R') {
				node[i].isR = true;
			}
			
			if(in.length == 2) {
				node[i].isO = true;
			}
		}
		
		for(int i = 0; i < N-1; i++) {
			int s = scan.nextInt()-1;
			int t = scan.nextInt()-1;
			node[s].child.add(t);
		}
		
		long ans = dfs(0);
		System.out.println(ans);
		
		scan.close();
	}
	
	static long dfs(int id) {
		Node now = node[id];
		long ret = 0;
		if(now.isE) {
			ret = 1;
			for(int i = 0; i < now.child.size(); i++) {
				ret = (dfs(now.child.get(i)) * ret) % MOD;
			}
			
			if(now.isO) ret = (ret + 1) % MOD;
		}
		
		if(now.isA) {
			if(now.isO) {
				ret = 1;
			}
			
			for(int i = 0; i < now.child.size(); i++) {
				ret = (dfs(now.child.get(i)) + ret) % MOD;
			}
		}
		
		if(now.isR) {
			long[] list = new long[now.child.size()];
			
			for(int i = 0; i < now.child.size(); i++) {
				list[i] = dfs(now.child.get(i));
			}
			
			long nn = (list[0]+1);
			
			for(int i = 1; i < list.length; i++) {
				nn = ((list[i]+1) * nn) % MOD;
			}
			
			if(!now.isO) nn--;
			ret = nn;
		}
		
		return ret;
	}
	
	static class Node {
		boolean isE;
		boolean isA;
		boolean isR;
		boolean isO;
		ArrayList<Integer> child = new ArrayList<Integer>();
	}
}