public class Main {
    public static void main(String args[]) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        int h[] = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }
        java.util.Arrays.sort(h);
        long ans = 0;
        for (int i = 0; i < Math.max(0, n - k); i++) {
            ans += h[i];
        }
        System.out.println(ans);
    }
}