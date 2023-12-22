import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        String s = sc.next();
        int[] r = new int[n];
        int[] g = new int[n];
        int[] b = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) == 'R') {
                r[i]++;
            } else if (s.charAt(i) == 'G') {
                g[i]++;
            } else {
                b[i]++;
            }
            if (i != 0) {
                r[i - 1] = r[i];
                g[i - 1] = g[i];
                b[i - 1] = b[i];
            }
        }
        long ans = 0;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    continue;
                }
                int sub = j - i;
                if ((s.charAt(i) == 'R' && s.charAt(j) == 'G') || (s.charAt(i) == 'G' && s.charAt(j) == 'R')) {
                    ans += b[j + 1];
                    if ((j + sub) < n && s.charAt(j + sub) == 'B') {
                        ans--;
                    }
                } else if ((s.charAt(i) == 'G' && s.charAt(j) == 'B') || (s.charAt(i) == 'B' && s.charAt(j) == 'G')) {
                    ans += r[j + 1];
                    if ((j + sub) < n && s.charAt(j + sub) == 'R') {
                        ans--;
                    }
                } else {
                    ans += g[j + 1];
                    if ((j + sub) < n && s.charAt(j + sub) == 'G') {
                        ans--;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}