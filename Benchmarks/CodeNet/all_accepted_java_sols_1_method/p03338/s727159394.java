import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.next());
        String s = sc.next();
        int[] ch = new int[26];
        int l = 0;
        int r = 0;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            Arrays.fill(ch, 0);
            l = 0;
            r = 0;
            for (int j = 0; j < i; j++) {
                if (ch[(int) s.charAt(j) - 97] == 0) {
                    ch[(int) s.charAt(j) - 97]++;
                    l++;
                }
            }
            // Arrays.fill(ch, 0);
            for (int j = i; j < n; j++) {
                if (ch[(int) s.charAt(j) - 97] == 1) {
                    ch[(int) s.charAt(j) - 97]++;
                    r++;
                }
            }
            // System.out.println(l + " " + r + " " + ans);
            ans = Math.max(ans, Math.min(l, r));
        }
        // int m = Integer.parseInt(sc.next());
        // int[] a = new int[n];
        // int ans = 0;

        // for (int i = 0; i < n; i++) {
        // a[i] = Integer.parseInt(sc.next());
        // }

        System.out.println(ans);

        sc.close();
    }
}