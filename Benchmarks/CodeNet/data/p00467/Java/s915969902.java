import java.util.*;

class Main{

    void solve(){
        Scanner sc = new Scanner(System.in);

        while(true){
            int n = sc.nextInt();
            int m = sc.nextInt();
            if(n==0 && m==0) break;

            int[] sugo = new int[n];
            for(int i=0; i<n; i++) sugo[i] = sc.nextInt();

            int pos = 1;
            int ans = Integer.MAX_VALUE;
            for(int i=0; i<m; i++){
                pos += sc.nextInt();
                if(pos>=n){
                    ans = Math.min(ans, i+1);
                    continue;
                }
                pos = Math.abs(pos+sugo[pos-1]);
                if(pos>=n) ans = Math.min(ans, i+1);
            }
            System.out.println(ans);
        }
    }

    public static void main(String[] args){
        new Main().solve();
    }
}