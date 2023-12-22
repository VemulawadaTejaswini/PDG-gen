import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        boolean[] ac = new boolean[n];
        int[] pn = new int[n];
        for (int i = 0; i < m; i++) {
            int p = sc.nextInt();
            String s = sc.next();
            if (s.equals("AC")) ac[p - 1] = true;
            else if (!ac[p - 1]) pn[p - 1]++;
        }
        int ans1 = 0, ans2 = 0;
        for (int i = 0; i < n; i++) {
            if (ac[i]) {
                ans1++;
                ans2 += pn[i];
            }
        }
        System.out.println(ans1 + " " + ans2);
    }
}