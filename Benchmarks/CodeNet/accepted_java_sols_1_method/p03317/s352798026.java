import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        if (n == k) {
            System.out.println(1);
        } else if (k == 2) {
            System.out.println(n - 1);
        } else {
            int a = n - k;
            int ans = (int) Math.ceil(a * 1.0 / (k - 1));
            System.out.println(ans + 1);
        }
    }
}