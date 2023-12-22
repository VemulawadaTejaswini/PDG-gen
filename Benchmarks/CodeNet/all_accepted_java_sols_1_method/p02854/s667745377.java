import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] al = new long[n+1];
        for(int i = 1; i <= n; i++){
            al[i] = al[i-1] + sc.nextLong();
        }
        long ans = Long.MAX_VALUE;
        for(int i = 1; i <= n; i++){
            ans = Math.min(ans,Math.abs(al[n]-al[i]*2));
        }
        System.out.println(ans);
    }
}
