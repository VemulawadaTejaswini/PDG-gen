import java.util.*;

public class Main{

    void solve(){
        Scanner sc = new Scanner(System.in);

        int[] w = {125,140,160};

        while(true){
            int n = sc.nextInt();
            if(n==-1) break;

            int ans = 1150;
            for(int i=0; i<3; i++){
                n -= 10;
                if(n<=0) break;
                ans += Math.min(n,10)*w[i];
            }
            System.out.println(4280-ans);
        }
    }

    public static void main(String[] args){
        new Main().solve();
    }
}