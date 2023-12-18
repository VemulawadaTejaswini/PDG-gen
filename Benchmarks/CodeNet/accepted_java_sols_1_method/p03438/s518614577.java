import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        long sumA = 0; // a[i] - b[i] が正の時、それを集計(必要な操作の回数)
        long sumB = 0; // a[i] - b[i] が負の時、a[i] + 1 = b[i] または a[i] = b[i] となるために必要な偶数を集計
        for (int i = 0; i < n; i++) {
            int bi = sc.nextInt();
            int diff = a[i] - bi;

            if (diff >= 0) {
                sumA += diff;
            } else {
                diff = -diff;
                sumB += diff - (diff % 2);
            }
        }

        System.out.println((sumA * 2 <= sumB) ? "Yes" : "No");
    }
}