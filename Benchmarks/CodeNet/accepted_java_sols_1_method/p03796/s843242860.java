import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        sc.close();

        long power = 1;
        long mod = 1000000007L;

        for (int i = 1; i <= n; i++) {
            power = power * i % mod;
        }

        System.out.println(power);
    }
}