import java.util.*;

public class Main{

    int n,m;
    int[][] c;

    void solve(){
        Scanner sc = new Scanner(System.in);

        while(true){
            n = sc.nextInt();
            m = sc.nextInt();
            if(n==0 && m==0) break;

            c = new int[n][n];
            for(int i=0; i<m; i++){
                int a = sc.nextInt()-1, b = sc.nextInt()-1;
                int cc = sc.nextInt();
                c[a][b] = cc;
            }

            System.out.println(getMin());
        }
    }

    int getMin(){
        //pos,cost,ticket,used
        PriorityQueue<int[]> q = 
            new PriorityQueue<int[]>(n,new Comparator<int[]>(){
                    public int compare(int[] a, int[] b){
                        return a[1] - b[1];
                    }
                });
        q.add(new int[]{0,0,0,0});
        boolean[][] v = new boolean[101][3];

        while(q.size()>0){
            int[] qq = q.poll();
            int pos = qq[0], cost = qq[1];
            int ticket = qq[2], used = qq[3];

            if(pos==n-1 && (ticket==0 || ticket==2)) return cost;
            if(v[pos][ticket]) continue;
            v[pos][ticket] = true;

            for(int i=0; i<n; i++){
                if(c[pos][i]==0) continue;
                if(ticket==0){
                    if(used==0){
                        q.add(new int[]{i,cost,1,1});
                        q.add(new int[]{i,cost+c[pos][i],0,0});
                    }else q.add(new int[]{i,cost+c[pos][i],0,1});
                }else if(ticket==1){
                    q.add(new int[]{i,cost,2,1});
                }else if(ticket==2){
                    q.add(new int[]{i,cost+c[pos][i],0,1});
                }
            }
        }

        return -1;
    }

    public static void main(String[] args){
        new Main().solve();
    }
}