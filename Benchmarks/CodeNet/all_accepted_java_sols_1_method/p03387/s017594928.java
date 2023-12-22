import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int k = sc.nextInt();
        sc.close();

        int max = Math.max(a, Math.max(k, b));

        int work = max * 3;

        int tmp = work - (a + b + k);

        if (tmp % 2 == 0) {
            System.out.println(tmp / 2);
        } else {
            System.out.println((tmp + 3) / 2);
        }
    }
}