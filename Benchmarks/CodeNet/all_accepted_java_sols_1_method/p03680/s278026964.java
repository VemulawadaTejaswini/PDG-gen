import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = scanner.nextInt();
        }
        int cur = 0;
        for (int i = 0; i < N; i++) {
            cur = a[cur] - 1;
            if (cur == 1) {
                System.out.println(i + 1);
                return;
            }
        }
        System.out.println(-1);
    }
}
