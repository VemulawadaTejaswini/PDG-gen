import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int A = cin.nextInt();
        int B = cin.nextInt();
        int cnt = 0;
        for (int i = A; i <= B; i++) {
            int n = i;
            int a = n % 10; n /= 10;
            int b = n % 10; n /= 10;
            n /= 10;
            int d = n % 10; n /= 10;
            int e = n % 10;

            if (a == e && b == d) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}