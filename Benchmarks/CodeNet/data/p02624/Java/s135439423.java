import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        long ans = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j += i) {
                ans += j;
            }
        }
        System.out.println(ans);
    }
}
