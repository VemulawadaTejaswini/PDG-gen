import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int c = sc.nextInt();
        int [] b = new int [m];
        for(int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }
        
        int ans = 0;
        for(int j = 0; j < n; j++) {
            int score = c;
            for(int i = 0; i < m; i++) {
                score += (sc.nextInt() * b[i]);
            }
            if(score > 0) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}