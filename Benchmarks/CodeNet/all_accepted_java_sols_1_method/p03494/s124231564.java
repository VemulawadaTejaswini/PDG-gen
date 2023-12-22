import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N =sc.nextInt();

        int ans = Integer.MAX_VALUE;
        for(int i=0;i<N;i++){
            int cnt = 0;
            int cur = sc.nextInt();
            while((cur&1)==0){
                cnt++;
                cur = cur/2;
            }
            ans = Math.min(ans,cnt);
        }
        System.out.println(ans);
    }
}