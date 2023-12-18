import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = Math.max(a, Math.max(b, c));
        
        int dif = max * 3 -a-b-c;
        
        int ans = 0;
        if (dif % 2 == 1) {
            ans += 2;
        }
        ans += dif / 2;
        
        System.out.println(ans);
    }
}