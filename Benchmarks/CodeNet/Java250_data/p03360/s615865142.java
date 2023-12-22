import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int k = sc.nextInt();
        sc.close();

        int max = 0;
        int ans = 0;

        max = Math.max(Math.max(a, b), c);
        if (max == a) {
            ans = b + c;
        } else if (max == b) {
            ans = a + c;
        } else {
            ans = a + b;
        }

        ans += max * Math.pow(2, k);

        System.out.println(ans);
    }
}