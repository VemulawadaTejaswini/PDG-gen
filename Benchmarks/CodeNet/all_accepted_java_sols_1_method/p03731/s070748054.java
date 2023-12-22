import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long T = sc.nextInt();
        long ans = 0;
        long t = 0;
        for(int i = 0;i < N;i++){
            long ti = sc.nextLong();
            ans += Math.min(ti-t, T);
            t = ti;
            if(i == N-1)    ans += T;
        }
        System.out.println(ans);
    }
}