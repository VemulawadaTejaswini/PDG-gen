import java.util.*;

class Main{

    int n,m;
    int[][] cost;
    int[] p;

    void solve(){
        Scanner sc = new Scanner(System.in);

        while(true){
            n = sc.nextInt();
            m = sc.nextInt();
            if(n==0 && m==0) break;

            cost = new int[m][3];
            for(int i=0; i<m; i++)for(int j=0; j<3; j++) cost[i][j] = sc.nextInt();

            init();

            Arrays.sort(cost, new Comparator<int[]>(){
                    public int compare(int[] a, int[] b){
                        return a[2] - b[2];
                    }
                });

            int ans = 0;
            for(int i=0; i<m; i++){
                int a = cost[i][0], b = cost[i][1];
                a = root(a); b = root(b);
                if(a==b) continue;
                merge(a,b);
                ans += cost[i][2];
            }

            System.out.println(ans);
        }
    }

    void init(){
        p = new int[n];
        for(int i=0; i<n; i++) p[i] = i;
    }

    int root(int a){
        if(a==p[a]) return a;
        else return p[a] = root(p[a]);
    }

    void merge(int a, int b){
        a = root(a); b = root(b);
        p[a] = b;
    }

    public static void main(String[] args){
        new Main().solve();
    }
}