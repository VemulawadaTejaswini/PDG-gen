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
            } else if (ai >= n) {
                if (time + b[bi] > k) {
                    break;
                }
                time += b[bi];
                bi++;
            } else if (bi >= m) {
                if (time + a[ai] > k) {
                    break;
                }
                time += a[ai];
                ai++;
            } else {
                int aa = a[ai];
                if (ai < n - 1) {
                    aa += a[ai + 1];
                }
                int bb = b[bi];
                if (bi < m - 1) {
                    bb += b[bi + 1];
                }
                if (aa <= bb) {
                    if (time + a[ai] > k) {
                        if (time + b[bi] < k) {
                            time += b[bi];
                            bi++;
                        } else {
                            break;
                        }
                    } else {
                        time += a[ai];
                        ai++;
                    }
                } else {
                    if (time + b[bi] > k) {
                        if (time + a[ai] < k) {
                            time += a[ai];
                            ai++;
                        } else {
                            break;
                        }
                    } else {
                        time += b[bi];
                        bi++;
                    }
                }
            }
            ans++;
        }
        System.out.println(ans);
    }
}