import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        // 初期状態（ソート前）の要素を表示
        for (int i = 0; i < a.length; i++) {
            if (i < a.length - 1) {
                System.out.print(a[i] + " ");
            } else {
                System.out.println(a[i]);
            }
        }
        // 挿入ソート
        for (int i = 1; i < n; i++) {
            int v = a[i];
            int j = i - 1;
            for (; j >= 0 && a[j] > v; j--) {
                a[j + 1] = a[j];
            }
            a[j + 1] = v;
            // 表示
            for (int k = 0; k < a.length; k++) {
                if (k < a.length - 1) {
                    System.out.print(a[k] + " ");
                } else {
                    System.out.println(a[k]);
                }
            }
        }

    }

}
