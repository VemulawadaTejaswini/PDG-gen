import java.util.Scanner;

public class Main {

	static int[] par, rank;
	
	static void init(int N) {//初期化
		for(int i=0; i<N; i++) {
			rank[i]=0;
			par[i]=i;
		}
	}

	static int root(int x) {//親を求める
		//System.out.println("para="+par[x]);
		if(par[x]==x) {
			return x;
		}
		return par[x]=root(par[x]);
	}

	static boolean same(int x, int y) {//判定(同グループかどうか)
		return (root(x)==root(y));
	}

	static void unite(int x, int y) {//まとめる
		x = root(x);
	    y = root(y);
	 
	    if(x == y)return;
	 
	    if(rank[x] < rank[y]){
	        par[x] = y;
	    }else{
	        par[y] = x;
	        if(rank[x] == rank[y])rank[x]++;
	    }
	}


	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
				int n=sc.nextInt();
				int m=sc.nextInt();
				rank=new int[n+1];
				par=new int[n+1];
				init(n);
				for(int i=0; i<m; i++) {
					int a=sc.nextInt();
					int b=sc.nextInt();
					unite(a, b);
				}
				int q=sc.nextInt();
				//System.out.println("q="+q);
				for(int i=0; i<q; i++) {
					int a=sc.nextInt();
					int b=sc.nextInt();
					//System.out.println("a="+a+" b="+b);
					if(same(a, b)) {
						System.out.println("yes");
					}
					else {
						System.out.println("no");
					}
				}

		}
	}
}
