import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int ans = 0;
        for(int i=1;i<=N;i+=2){
            if(helper(i)==8) ans++;
        }
        System.out.println(ans);
    }
    public static int helper(int N){
        int up = (int) Math.floor(Math.sqrt(N));
        int cnt=2;
        for(int i=2;i<=N-1;i++){
            if(N%i==0) cnt++;
        }
        return cnt;
    }
}
