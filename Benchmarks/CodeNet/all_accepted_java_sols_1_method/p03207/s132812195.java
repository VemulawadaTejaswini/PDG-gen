import java.util.*;

public class Main {
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int p;
        int max = 0;
        int ans = 0;
        
        for (int i = 0; i < N; i++) {
            p = scan.nextInt();
            if (p > max) {
                max = p;
            }
            ans += p;
        }
        System.out.println(ans - max / 2);
        scan.close();
    }
}