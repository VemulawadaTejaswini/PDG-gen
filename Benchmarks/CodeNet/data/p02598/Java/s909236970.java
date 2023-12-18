import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < A.length; i++) {
            A[i] = sc.nextInt();
        }
        int l = 0;
        int r = (int)Math.pow(10, 9);
        while (r - l > 1) {
            int x = (l + r) / 2;
            long now = 0;
            for (int i = 0; i < A.length; i++) {
                now += (A[i] - 1) / x;
            }
            if (now <= K) {
                r = x;
            } else {
                l = x;
            }
        }
        System.out.println(r);
        sc.close();
    }
}