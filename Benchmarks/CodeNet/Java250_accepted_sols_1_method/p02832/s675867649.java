import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] a = new int[N];
        int cntOfRemain = 0;

        for (int i = 0; i < N; i++) a[i] = sc.nextInt();

        if (N == 1 && a[0] == 1) {
            System.out.println(0);
            return;
        }

        for (int i = 0; i < N; i++) {
            if (cntOfRemain + 1 == a[i]) {
                cntOfRemain++;
            }
        }

        System.out.println(cntOfRemain == 0 ? -1 : N - cntOfRemain);
    }
}