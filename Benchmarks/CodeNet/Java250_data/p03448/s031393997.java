import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int fiveHundred = Integer.parseInt(sc.next());
        int hundred = Integer.parseInt(sc.next());
        int fifty = Integer.parseInt(sc.next());
        int target = Integer.parseInt(sc.next());
        int ans = 0;
        for (int i = 0; i <= fiveHundred; i++) {
            for (int j = 0; j <= hundred; j++) {
                for (int k = 0; k <= fifty; k++) {
                    int total = (i * 500) + (j * 100) + (k * 50);
                    if (total == target) {
                        ans++;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
