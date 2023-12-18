import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        List<Integer>[] s = new ArrayList[m];
        for (int i = 0; i < m; i++) {
            s[i] = new ArrayList<>();
            int k = scanner.nextInt();
            for (int i1 = 0; i1 < k; i1++) {
                s[i].add(scanner.nextInt() - 1);
            }
        }

        int[] p = new int[m];
        for (int i = 0; i < m; i++) {
            p[i] = scanner.nextInt();
        }

        int ans = 0;
        l: for (int i = 0; i < 1 << n; i++) {
            char[] aChar = String.format("%0" + n + "d", Integer.parseInt(Integer.toBinaryString(i))).toCharArray();
            for (int i1 = 0; i1 < m; i1++) {
                int r = 0;
                for (Integer i2 : s[i1]) {
                    if (aChar[i2] == '1')
                        r++;
                }
                if (r % 2 != p[i1]) {
                    continue l;
                }
            }
            ans++;

        }
        System.out.println(ans);
    }
}