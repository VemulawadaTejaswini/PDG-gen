import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int N = sc.nextInt();
            int[] a = new int[N];
            for (int i = 0; i < N; i++) {
                a[i] = sc.nextInt() - 1;
            }
            int pos = 0;
            int ans = -1;
            for (int i = 0; i < N; i++) {
                if (pos == 1) {
                    ans = i;
                    break;
                }
                pos = a[pos];
            }

            System.out.println(ans);
        }
    }
}
