import java.util.*;
import static java.lang.Math.*;

class Main {
    final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        int l = sc.nextInt();
        int r = sc.nextInt();
        int d = sc.nextInt();
        
        int ans = 0;
        for (int i = l; i <= r; i++) {
            if (i % d == 0) ans++;
        }
        System.out.println(ans);
    }
}
