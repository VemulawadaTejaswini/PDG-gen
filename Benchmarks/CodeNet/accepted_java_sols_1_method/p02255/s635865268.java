import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 入力
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            System.out.print(a[i]);
            if (i == n - 1)
                break;
            System.out.print(" ");
        }
        System.out.println();

        for (int i = 1; i < n; i++) {

            // ソート
            int temp = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > temp) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = temp;

            // 出力
            for (int t = 0; t < n; t++) {
                System.out.print(a[t]);
                if (t == n - 1)
                    break;
                System.out.print(" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
