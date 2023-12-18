import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        int ans = 0;
        while (n-- > 0) {
            int num = sc.nextInt();
            int tmp = Math.min(k-num, num);
            ans += tmp;
        }
        System.out.println(ans*2);
    }
}
