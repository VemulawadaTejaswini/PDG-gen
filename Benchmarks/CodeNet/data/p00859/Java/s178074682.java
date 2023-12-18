import java.util.*;

public class Main{

    int n,m;
    int[][] e;

    void solve(){
        Scanner sc = new Scanner(System.in);

        while(true){
            n = sc.nextInt();
            m = sc.nextInt();
            if(n==0 && m==0) break;

            //a, b, w
            e = new int[m][3];
            for(int i=0; i<m; i++){
                int a = sc.nextInt(), b = sc.nextInt();
                int w = sc.nextInt();
                e[i] = new int[]{a-1,b-1,w};
            }

            Arrays.sort(e, new Comparator<int[]>(){
                    public int compare(int[] a, int[] b){
                        return a[2] - b[2];
                    }
                });
            int ans = Integer.MAX_VALUE;
            for(int i=0; i<m && m-i>=n-1; i++){
                ans = Math.min(ans, kruskal(i));
            }

            if(ans==Integer.MAX_VALUE) ans = -1;
            System.out.println(ans);
        }
    }

    int kruskal(int idx){
        init();

        int res = 0;
        for(int i=idx;i<m; i++){
            if(!same(e[i][0],e[i][1])){
                unite(e[i][0],e[i][1]);
                res = e[i][2];
            }
        }

        boolean same = true;
        for(int i=1; i<n; i++){
            if(!same(0,i)){
                same = false;
                break;
            }
        }

        if(same) return res-e[idx][2];
        else return Integer.MAX_VALUE;
    }

    int[] par, rank;
    void init(){
        par = new int[n];
        rank = new int[n];
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
        x = find(x);
        y = find(y);
        if(x==y) return;
        if(rank[x]<rank[y]) par[x] = y;
        else{
            par[y] = x;
            if(rank[x]==rank[y]) rank[x]++;
        }
    }
    boolean same(int x, int y){
        return find(x)==find(y);
    }

    public static void main(String[] args){
        new Main().solve();
    }
}