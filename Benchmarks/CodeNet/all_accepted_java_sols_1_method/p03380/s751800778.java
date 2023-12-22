import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(sc.next());
        }
        sc.close();
        Arrays.sort(a);
        int max = a[n - 1];
        double mid = max / 2.0;
        int ans = 0;
        double min = max;
        for (int i = 0; i < n; i++) {
            if (min > Math.abs(a[i] - mid)) {
                min = Math.abs(a[i] - mid);
                ans = i;
            }
            if (a[i] > mid) {
                break;
            }
        }
        System.out.println(max + " " + a[ans]);
    }
}