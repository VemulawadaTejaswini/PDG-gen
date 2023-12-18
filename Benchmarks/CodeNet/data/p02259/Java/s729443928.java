
import java.util.Scanner;

public class Main {
    public static int bubble_sort(int[] a, int n) {
        int cnt = 0;
        int flag = 0; // 完了した場所
        while (flag < n - 1) {
            for (int i = n - 2; i >= 0; i--) {
                if (a[i] > a[i + 1]) {
                    int temp = a[i + 1];
                    a[i + 1] = a[i];
                    a[i] = temp;
                    cnt++;
                }

            }
            flag++;
        }
        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int ans = bubble_sort(a, n);
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]);
            if (i < n - 1)
                System.out.print(" ");
        }
        System.out.println();
        System.out.println(ans);
        sc.close();
    }
}
