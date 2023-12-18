import java.util.*;

class Main{

    int[] cnt;
    int n,m,k;

    void solve(){
        Scanner sc = new Scanner(System.in);

        while(true){
            n = sc.nextInt();
            m = sc.nextInt();
            k = sc.nextInt();
            if(n==0 && m==0 && k==0) break;

            cnt = new int[10000];

            bfs();

            double mn = Math.pow(m,n);
            double ans = 0.0;
            for(int i=1; i<cnt.length; i++){
                if(cnt[i]>0){
                    //System.out.println(i+" "+cnt[i]);
                    ans += ((double)cnt[i]/mn) * i;
                }
            }

            System.out.println(ans);
        }
    }

    void bfs(){
        //pos, sum, num
        Queue<int[]> q = new LinkedList<int[]>();
        q.add(new int[]{0, 0});

        while(q.size()>0){
            int[] qq = q.poll();
            int sum = qq[0], num = qq[1];

            if(num==n){
                cnt[Math.max(1, sum-k)]++;
                continue;
            }

            for(int i=1; i<=m; i++){
                q.add(new int[]{sum+i, num+1});
            }
        }
    }

    public static void main(String[] args){
        new Main().solve();

    }
}