import java.util.*;

public class Main{

    void solve(){
        Scanner sc = new Scanner(System.in);

        while(true){
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int x = sc.nextInt();
            if(n==0 && a==0 && b==0 && c==0 && x==0) break;
            int[] y = new int[n];
            for(int i=0; i<n; i++) y[i] = sc.nextInt();

            int cnt = 0;
            for(int i=0; i<n; i++){
                while(x!=y[i]){
                    x = (a*x+b)%c;
                    cnt++;
                    if(cnt>10000) break;
                }
                if(cnt>10000) break;
                if(i!=n-1){
                    x = (a*x+b)%c;
                    cnt++;
                }
            }

            if(cnt>10000) cnt = -1;
            System.out.println(cnt);
        }
    }

    public static void main(String[] args){
        new Main().solve();
    }
}