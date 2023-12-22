import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final long x = sc.nextLong();

        long ans = 0;
        long money = 100;
        while (true) {
            if (money >= x) {
                System.out.println(ans);
                return;
            }

            money += money * 0.01;
            ans++;
        }
    }
}
