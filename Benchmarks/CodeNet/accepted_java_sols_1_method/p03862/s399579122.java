import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0 ; i < n ; i++ ) {
            a[i] = sc.nextInt();
        }
        long count = 0;
        for (int i = 0 ; i < n - 1 ; i++) {
            //右側の箱から優先して飴を取り出すように実装。
            int b = a[i] + a[i + 1];
            if (b > x) {
                if (a[i + 1] > b - x) {
                    a[i + 1] -= b - x;
                    count += b - x;
                } else {
                    count += b - x;
                    a[i + 1] = 0;
                }
            }
        }
        System.out.println(count);

    }

}