import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer, Integer> m = new HashMap<Integer, Integer>();
        for (int i = 1 ; i <= n ; i++) {
            int y = i;
            for (int j = 2 ; j <= i ; j++) {
                while (y % j == 0 ) {
                    if (m.containsKey(j)) {
                        m.put(j, m.get(j) + 1);
                    } else {
                        m.put(j, 2);
                    }
                    y /= j;
                }
            }
        }
        long ans = 1;
        for (Integer c : m.values()) {
            ans *= (long) c;
            ans %= 1000000007;
        }
        System.out.println(ans);
    }

}