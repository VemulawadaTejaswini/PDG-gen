import java.util.*;

class Main{

    void solve(){
        Scanner sc = new Scanner(System.in);

        while(true){
            int t = sc.nextInt();
            if(t==0) break;
            int n = sc.nextInt();
            int cnt = 0;
            for(int i=0; i<n; i++){
                int s = sc.nextInt(), f = sc.nextInt();
                cnt += f-s;
            }
            if(cnt >= t) {
                System.out.println("OK");
            }else{
                System.out.println(t-cnt);
            }
        }
    }

    public static void main(String[] args){
        new Main().solve();
    }
}