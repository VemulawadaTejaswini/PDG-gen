import java.util.Scanner;

public class Main {

    void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] p = new int[N];
        for (int i = 0; i < N; i++) {
            p[i] = sc.nextInt();
        }
        if (isOK(p)) {
            System.out.println("YES");
            return;
        }
        for (int i = 0; i <= N - 2; i++) {
            for (int j = i + 1; j <= N - 1; j++) {
                int[] pClone = p.clone();
                int tmp = pClone[i];
                pClone[i] = pClone[j];
                pClone[j] = tmp;
                if (isOK((pClone))) {
                    System.out.println("YES");
                    return;
                }
            }
        }
        System.out.println("NO");
    }

    boolean isOK (int[] array) {
        for (int i = 0; i <= array.length - 2; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }

    // Main
    public static void main(String[] args) {
        new Main().solve();
    }
}

