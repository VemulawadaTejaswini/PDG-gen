import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans = 0;
        sc.close();

        ans = Math.max(a + b, a - b);
        ans = Math.max(ans, a * b);

        System.out.println(ans);
    }
}