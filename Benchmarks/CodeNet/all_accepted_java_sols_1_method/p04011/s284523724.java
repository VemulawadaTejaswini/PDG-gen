import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // 入力(n)
        int n = sc.nextInt();
        // 入力(k)
        int k = sc.nextInt();
        // 入力(x)
        int x = sc.nextInt();
        // 入力(y)
        int y = sc.nextInt();

        int fee = 0;
        if (n <= k) {
            fee = n * x;
        } else {
            fee = k * x + (n - k) * y;
        }
        System.out.println(fee);
        sc.close();
    }
}