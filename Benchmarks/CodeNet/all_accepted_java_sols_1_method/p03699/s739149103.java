import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int ans = 0;
        int m = 1000;
        for(int i = 0;i < N;i++){
            int a = sc.nextInt();
            ans += a;
            if(a%10 != 0)   m = Math.min(m, a);
        }
        if(ans%10 == 0) ans -= m;
        if(ans%10 == 0) System.out.println(0);
        else    System.out.println(ans);
    }
}