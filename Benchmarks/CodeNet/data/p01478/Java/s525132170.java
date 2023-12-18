import java.util.*;

public class Main{

    int n;
    int[][] c;
    char[] per;
    boolean[] used;
    int goal,ans;
    ArrayList<String> slist;

    void solve(){
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        c = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                int cc = sc.nextInt();
                c[i][j] = cc;
                c[j][i] = cc;
            }
        }

        String s = "";
        for(int i=1; i<=n; i++) s += Integer.toString(i);
        goal = Integer.parseInt(s);

        slist = new ArrayList<String>();
        per = new char[n];
        used = new boolean[n];
        ans = 0;
        dfs(0,0);

        System.out.println(ans);
    }

    void dfs(int pos,int num){
        if(pos==n){
            ans = Math.max(ans, dijkstra(new String(per)));
            return;
        }

        for(int i=0; i<n; i++){
            if(used[i]) continue;
            per[pos] = (char)('0'+(i+1));
            if(i==pos){
                if(n%2==0 || num==1) continue;
                else if(num==0){
                    used[i] = true;
                    dfs(pos+1,1);
                    used[i] = false;
                }
            }else{
                used[i] = true;
                dfs(pos+1,num);
                used[i] = false;
            }
        }
    }

    int dijkstra(String ss){
        //permutation,cost
        PriorityQueue<int[]> 
            q = new PriorityQueue<int[]>(n, new Comparator<int[]>(){
                    public int compare(int[] a, int[] b){
                        return a[1] - b[1];
                    }
                });

        q.add(new int[]{Integer.parseInt(ss),0});
        boolean[] v = new boolean[8765433];

        while(q.size()>0){
            int[] pp = q.poll();
            int perm = pp[0];
            int cost = pp[1];

            if(perm==goal) return cost;
            if(v[perm/10]) continue;
            v[perm/10] = true;

            char[] permm = Integer.toString(perm).toCharArray();

            for(int i=0; i<n; i++){
                for(int j=i+1; j<n; j++){
                    char tmp = permm[i];
                    permm[i] = permm[j];
                    permm[j] = tmp;
                    q.add(new int[]{Integer.parseInt(new String(permm)), cost+c[i][j]});
                    tmp = permm[i];
                    permm[i] = permm[j];
                    permm[j] = tmp;
                }   
            }
        }
        return -1;
    }

    public static void main(String[] args){
        new Main().solve();
    }
}