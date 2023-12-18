import java.util.*;

public class Main{

    void solve(){
        Scanner sc = new Scanner(System.in);

        int[] w = {125,140,160};

        while(true){
            int n = sc.nextInt();
            if(n==-1) break;

            int ans = 1150;
            n -= 10;
            if(n<0) n = 0;
            for(int i=0; i<2; i++){
                if(n>=10){
                    ans += 10*w[i];
                    n -= 10;
                }else{
                    ans += w[i]*n;
                    n = 0;
                    break;
                }
            }
            ans += n*w[2];

            System.out.println(4280-ans);
        }
    }

    public static void main(String[] args){
        new Main().solve();
    }
}