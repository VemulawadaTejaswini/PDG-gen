import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int P = sc.nextInt();
        int Q = sc.nextInt();
        int R = sc.nextInt();
        int ans;

        ans = P+Q;

        if(ans >= Q+R){
            ans = Q + R;
        }
        if(ans >= R+P){
            ans = R + P;
        }

        System.out.println(ans);
    }
}