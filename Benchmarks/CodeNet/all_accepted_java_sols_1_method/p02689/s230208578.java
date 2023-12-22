import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] h = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }
        boolean[] hh = new boolean[n];
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(h[a - 1] <= h[b - 1]) {
                hh[a -1] = true;
            }
            if(h[a - 1] >= h[b - 1]) {
                hh[b -1] = true;
            }
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if(!hh[i]) ans++;
        }
        System.out.println(ans);
    }
}