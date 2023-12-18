import java.util.*;

class Main{

    int[] par, rank;

    void init(int n){
	par = new int[n]; rank = new int[n];
	for(int i=0; i<n; i++){
	    par[i] = i;
	    rank[i] = 0;
	}
    }

    int find(int x){
	if(par[x]==x) return x;
	else return par[x] = find(par[x]);
    }

    void unite(int x, int y){
	x = find(x); y = find(y);
	if(x==y) return;

	if(rank[x] < rank[y]) par[x] = y;
	else{
	    par[y] = x;
	    if(rank[x]==rank[y]) rank[x]++;
	}
    }

    boolean same(int x, int y){
	return find(x) == find(y);
    }

    void solve(){
	Scanner sc = new Scanner(System.in);

	while(true){
	    int n = sc.nextInt(), m = sc.nextInt();
	    if(n==0 && m==0) break;

	    int[][] edge = new int[m][3];
	    for(int i=0; i<m; i++){
		for(int j=0; j<3; j++){
		    edge[i][j] = sc.nextInt();
		    if(j!=2) edge[i][j]--;
		}
	    }

	    Arrays.sort(edge, new Comparator<int[]>(){
		    public int compare(int[] a, int[] b){
			return a[2] - b[2];
		    }
		});

	    int INF = Integer.MAX_VALUE/2;
	    int min = INF;
	    for(int i=0; i<m; i++){
		int cnt = 0;
		int max = 0;
		init(n);
		for(int j=i; j<m; j++){
		    if(same(edge[j][0], edge[j][1])) continue;
		    unite(edge[j][0], edge[j][1]);
		    max = edge[j][2] - edge[i][2];
		    cnt++;
		    if(cnt==n-1) break;
		}
		if(cnt==n-1) min = Math.min(min, max);
	    }
	    if(min==INF) System.out.println(-1);
	    else System.out.println(min);
	}
    }

    public static void main(String[] args){
	new Main().solve();
    }
}