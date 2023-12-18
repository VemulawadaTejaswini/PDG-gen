import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        long ans = 1;
        long num = 1000000007;
        for (long i = 1; i <= n; i++) {
            ans =  (ans * i) % num;
        }
        System.out.println(ans);
    }
}
