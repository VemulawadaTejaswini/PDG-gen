import java.util.*;

class Main{

    int[] par, rank;

    void init(int n){
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

    void unit(int x, int y){
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
        return find(x) == find(y);
    }

    void solve(){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        while(n!=0 || m!=0){
            if(m==0){
                System.out.println("-1");
                n = sc.nextInt();
                m = sc.nextInt();
                continue;
            }

            int[][] edge = new int[m][3];
            for(int i=0; i<m; i++){
                edge[i][0] = sc.nextInt()-1;
                edge[i][1] = sc.nextInt()-1;
                edge[i][2] = sc.nextInt();
            }

            Arrays.sort(edge, new Comparator<int[]>(){
                    public int compare(int[] a, int[] b){
                        return a[2] - b[2];
                    }
                });

            int max = Integer.MAX_VALUE;            
            int min = edge[0][2];
            for(int i=0; i<m; i++){
                init(n);
                min = edge[i][2];
                int maxx = 0;
                int cnt = 0;
                for(int j=i; j<m; j++){
                    if(same(edge[j][0], edge[j][1])) continue;
                    maxx = edge[j][2] - min;
                    unit(edge[j][0], edge[j][1]);
                    cnt++;
                    if(cnt==n-1) break;
                }
                if(cnt==n-1) max = Math.min(max, maxx);
                //while(i+1<n && edge[i+1][2]==min) i++;
            }

            if(max==Integer.MAX_VALUE) System.out.println("-1");
            else System.out.println(max);

            n = sc.nextInt();
            m = sc.nextInt();
        }
    }

    public static void main(String[] args){
        new Main().solve();
    }
}