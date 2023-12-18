import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        for (int i = n; i < 1000; i++) {
            int tmp = i;
            int a = tmp % 10;
            tmp /= 10;
            int b = tmp % 10;
            tmp /= 10;
            int c = tmp % 10;

            if (a == b && b == c) {
                System.out.println(i);
                return;
            }
        }
    }
}