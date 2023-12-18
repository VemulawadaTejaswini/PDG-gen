import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        Integer[] a = new Integer[n];
        Integer[] b = new Integer[m];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(sc.next());
        }
        for (int i = 0; i < m; i++) {
            b[i] = Integer.parseInt(sc.next());
        }
        int ans = 0;
        int time = 0;
        int ai = 0;
        int bi = 0;
        while (true) {
            if (ai >= n && bi >= m) {
                break;
            } else if (ai == n) {
                if (time + b[bi] > k) {
                    break;
                }
                time += b[bi];
                bi++;
            } else if (bi == m) {
                if (time + a[ai] > k) {
                    break;
                }
                time += a[ai];
                ai++;
            } else {
                if (a[ai] <= b[bi]) {
                    if (time + a[ai] > k) {
                        break;
                    }
                    time += a[ai];
                    ai++;
                } else {
                    if (time + b[bi] > k) {
                        break;
                    }
                    time += b[bi];
                    bi++;
                }
            }
            ans++;
        }
        System.out.println(ans);
    }
}