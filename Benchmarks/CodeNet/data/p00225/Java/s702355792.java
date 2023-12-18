import java.util.*;

class UnionFind{
	int [] pars;
	UnionFind(int n){
		pars = new int[n];
		for(int i=0; i<n; i++)
			pars[i] = i;
	}
	
	int getRoot(int x){
		if(x == pars[x]) return x;
		return pars[x] = getRoot(pars[x]);
	}
	
	public void merge(int x, int y){
		pars[getRoot(x)] = getRoot(y);
	}
	
	public boolean isSame(int x, int y){
		return getRoot(x) == getRoot(y);
	}
}

class Main {

	int n;
	String strs[];

	void run(){
		Scanner in = new Scanner(System.in);
		for(;;){
			n = in.nextInt();
			if(n == 0) return;
			strs = new String[n];
			for(int i=0; i<n; i++)
				strs[i] = in.next();
			System.out.println(solve()?"OK":"NG");
		}
	}

	boolean solve(){
		int[] in = new int[26], out = new int[26];
		UnionFind uf = new UnionFind(26);
		for(int i=0; i<n; i++){
			int from = (int)(strs[i].charAt(0)-'a');
			int to = (int)(strs[i].charAt(strs[i].length()-1)-'a');
			in[from]++;
			out[to]++;
			uf.merge(from, to);
		}
		for(int i=0; i<26; i++)if(in[i] != out[i]) return false;
		for(int i=0; i<n; i++)if(in[i] > 0)
			for(int j=0; j<n; j++)if(in[j] > 0)
				if(!uf.isSame(i, j)) return false;
		return true;
	}

	
	public static void main(String args[]){
		new Main().run();
	}
}