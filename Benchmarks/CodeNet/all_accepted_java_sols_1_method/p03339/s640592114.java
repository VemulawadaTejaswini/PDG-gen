import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] s = sc.next().toCharArray();
        int result = Integer.MAX_VALUE;
        int[] w = new int[n];
        int[] e = new int[n];
        int countW = 0;
        int countE = 0;
        for (int i = 0; i < n; i++) {
            if (s[i] == 'W') {
                countW++;
            }
            w[i] = countW;
            if (s[n - 1 - i] == 'E') {
                countE++;
            }
            e[n - 1 - i] = countE;
        }
        for (int i = 0; i < n; i++) {
            result = Math.min(result, w[i] + e[i] - 1);
        }
        System.out.println(result);

    }
}