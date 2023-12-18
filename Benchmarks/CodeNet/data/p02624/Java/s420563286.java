import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        long ans = 0;
        List<Long> num = new ArrayList<>();
        for (int i = 0; i <= 100000001; i++) {
            num.add(0L);
        }
        for (int i = 2; i <= n; i++) {
            for (int j = 1; i * j <= n; j++) {
                long temp = num.get((int)i * j);
                num.set((int)i * j, temp + 1);
            }
        }
        for (int i = 2; i <= n; i++) {
            ans += (num.get(i) + 1) * i;
        }
        System.out.println(ans + 1);
    }
}