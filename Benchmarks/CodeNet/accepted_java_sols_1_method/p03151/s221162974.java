import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];
        int d[] = new int[n];
        int count = 0;// 負の数の個数
        long wa = 0; // 負の数の総和
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {

            b[i] = sc.nextInt();
            d[i] = a[i] - b[i];
            if (d[i] < 0) {
                wa += d[i];
                count++;
            }
        }

        Arrays.sort(d);
        int ans = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (wa >= 0) {
                break;
            }
            wa += d[i];
            ans++;
        }
        if (wa < 0) {
            System.out.println(-1);
        } else {
            System.out.println(ans + count);
        }
    }
}
