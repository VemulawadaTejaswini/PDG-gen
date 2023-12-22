import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        int ans = 0;
        for(int i = 0; i < N; i++) {
            int x = sc.nextInt();
            while( x % 2 == 0 ) {
                x /= 2;
                ans++;
            }
        }
        System.out.println(ans);
    }
}
