import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long t = sc.nextLong();
        long ans = 0;
        long[] al = new long[n];
        for(int i = 0; i < n; i++){
            al[i] = sc.nextLong();
        }
        for(int i = 0; i < n-1; i++){
            ans += Math.min(al[i+1] - al[i], t);
        }
        System.out.println(ans+t);
    }
}
