import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }
        int ans = 0;
        int target = 1;

        for (int i = 0; i < N; i++) {
            if (a[i] != target) {
                ans++;
                continue;
            }
            if (a[i] == target) {
                target++;
            }
        }
        if (target == 1) {
            System.out.println(-1);
            return;
        }
        System.out.println(ans);
    }

}