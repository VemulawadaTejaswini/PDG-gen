import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int ans = 0;
        for(int i = 0; i < n; i++){
            int x = sc.nextInt();
            ans += 2 * Math.min(Math.abs(x),Math.abs(k-x));
        }
        System.out.println(ans);
    }
}
