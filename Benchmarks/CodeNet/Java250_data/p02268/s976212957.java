import java.util.Scanner;

public class Main {
    static int[] s;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        s = new int[n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.nextInt();
        }
        int q = sc.nextInt();
        int c = 0;
        for (int i = 0; i < q; i++) {
            int t = sc.nextInt();
            if (binarySearchContains(t)) {
                c++;
            }
        }
        System.out.println(c);
    }

    public static boolean binarySearchContains(int v) {
        int l = 0; // left
        int r = s.length - 1; // right
        while (l <= r) {
            int m = (r + l) / 2;
            if (s[m] == v) {
                return true;
            }
            if (s[m] > v) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return false;
    }
}