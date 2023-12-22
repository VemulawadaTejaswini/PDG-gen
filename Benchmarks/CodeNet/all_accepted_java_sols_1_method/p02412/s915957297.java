import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            if (n == 0 && x == 0) {
                break;
            }
            int ans = 0;
            for (int i = 1; i <= n; i++) {
                for (int j = i + 1; j <= n; j++) {
                    int need = x - (i + j);
                    if (need <= n && need > i && need != j) {
                        ans++;
                    }
                }
            }
            System.out.println(ans / 2);
        }
    }
}
