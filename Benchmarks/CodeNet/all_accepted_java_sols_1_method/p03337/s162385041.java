import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int res1 = a + b;
        int res2 = a - b;
        int res3 = a * b;

        int ans = Math.max(res1, res2);
        int ans1 = Math.max(ans, res3);
        int ans2 = Math.max(ans, res3);

        System.out.println(ans2);
    }
}
