import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int a = 0;
        for(int i = 0;i < N;i++){
            int b = sc.nextInt();
            if(b == 1)  a = i;
        }
        if(N == K){
            System.out.println(1);
            return;
        }
        int ans = 1;
        N -= K;
        ans += N/(K-1);
        if(N%(K-1) != 0)    ans++;
        System.out.println(ans);
    }
}