import java.util.*;

class Main {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] b = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            b[i] = sc.nextInt();
        }
        sc.close();
        int a = b[0];
        for (int i = 0; i < n - 2; i++) {
            a += Math.min(b[i], b[i + 1]);
        }
        a += b[n - 2];
        System.out.println(a);
    }
}
