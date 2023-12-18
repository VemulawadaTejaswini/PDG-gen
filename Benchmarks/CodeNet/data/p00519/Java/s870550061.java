import java.util.*;

class Main{

    int n, k;
    int[] c, r;
    boolean[][] road;

    void solve(){
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        k = sc.nextInt();
        c = new int[n];
        r = new int[n];
        for(int i=0; i<n; i++){
            c[i] = sc.nextInt();
            r[i] = sc.nextInt();
        }
        road = new boolean[n][n];
        for(int i=0; i<k; i++){
            int a = sc.nextInt()-1, b = sc.nextInt()-1;
            road[a][b] = true;
            road[b][a] = true;
        }

        System.out.println(dijkstra());
    }

    int dijkstra(){
        //pos, left, sum
        PriorityQueue<int[]> q = new PriorityQueue<int[]>(10, new Comparator<int[]>(){
                public int compare(int[] a, int[] b){
                    return a[2] - b[2];
                }
            });
        //q.add(new int[]{0, r[0], c[0]});
        q.add(new int[]{0, 0, 0});
        boolean[][] v = new boolean[n][n];

        while(q.size()>0){
            int[] qq = q.poll();
            int pos = qq[0], left = qq[1], sum = qq[2];

            //System.out.println(pos+" "+left+" "+sum);

            if(pos==n-1) return sum;
            if(v[pos][left]) continue;
            v[pos][left] = true;

            for(int i=0; i<n; i++){
                if(!road[pos][i]) continue;
                if(left-1>=0) q.add(new int[]{i, left-1, sum});
            }
            q.add(new int[]{pos, r[pos], sum + c[pos]});

        }
        return -1;
    }

    public static void main(String[] args){
        new Main().solve();
    }
}