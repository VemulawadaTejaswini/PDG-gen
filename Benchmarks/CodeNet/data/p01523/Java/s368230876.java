import java.util.*;

class Main{

    int INF = Integer.MAX_VALUE;

    void solve(){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] ab = new int[m][2];
        for(int i=0; i<m; i++){
            ab[i][0] = sc.nextInt()-1;
            ab[i][1] = sc.nextInt()-1;
        }

        Arrays.sort(ab, new Comparator<int[]>(){
                public int compare(int[] a, int[] b){
                    if(a[0]>b[0]) return 1;
                    if(a[0]<b[0]) return -1;
                    if(a[1]>b[1]) return 1;
                    if(a[1]<b[1]) return -1;
                    return 0;
                }
            });

        int cnt = 0;
        int idx = 0;
        while(idx<n){
            int idx2 = -1;
            for(int i=0; i<m; i++){
                if(ab[i][0]<=idx && idx<=ab[i][1]) idx2 = Math.max(idx2, ab[i][1]);
            }
            if(idx2==-1) break;
            idx = idx2 + 1;
            cnt++;
        }

        if(idx!=n) System.out.println("Impossible");
        else System.out.println(cnt);
    }

    public static void main(String[] args){
        new Main().solve();
    }
}