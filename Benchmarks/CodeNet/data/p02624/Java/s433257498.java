import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long ans = 1;
        for (int i = 2; i <= n; i++) {
            ans += i * fetchFk(i);
        }
        System.out.println(ans);
    }

    private static int fetchFk(int n) {
        HashMap<Integer, Integer> m = new HashMap();
        int div = 2;
        while (n >= div) {
            if (n % div == 0) {
                n /= div;
                if (m.get(div) != null) {
                    m.put(div, m.get(div) + 1);
                } else {
                    m.put(div, 1);
                }
                div = 2;
            } else {
                div++;
            }
        }
        int fk = 1;
        for (Map.Entry<Integer, Integer> e : m.entrySet()) {
            fk *= e.getValue() + 1;
        }
        return fk;
    }
}