import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int x = Integer.parseInt(sc.next());
        int y = Integer.parseInt(sc.next());
        sc.close();
        int ans[] = new int[n];
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                int direct = j - i;
                int shortcut = Math.abs(i - x) + 1 + Math.abs(j - y);
                int dist = Math.min(direct, shortcut);
                ans[dist]++;
            }
        }
        for (int i = 1; i < n; i++) {
            System.out.println(ans[i]);
        }
    }
}