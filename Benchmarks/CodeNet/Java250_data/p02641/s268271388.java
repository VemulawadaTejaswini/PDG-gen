import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        Integer[] p = new Integer[n];
        for (int i = 0; i < n; i++) {
            p[i] = sc.nextInt();
        }
        if (n == 0) {
            System.out.println(x);
            return;
        } else if (!checkForbiddenList(p, x)) {
            System.out.println(x);
            return;
        } else {
            int ans = 0;
            for (int i = 0; i < 100; i++) {
                if (!checkForbiddenList(p, x - i)) {
                    ans = x - i;
                    break;
                } else if (!checkForbiddenList(p, x + i)) {
                    ans = x + i;
                    break;
                }
            }
            System.out.println(ans);
            return;
        }
    }

    private static boolean checkForbiddenList(Integer[] p, int x) {
        return Arrays.asList(p).contains(x);
    }
}