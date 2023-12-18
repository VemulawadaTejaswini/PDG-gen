import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        long fiveHCoins = x / 500;
        x -= fiveHCoins * 500;
        long fiveCoins = x / 5;
        long ans = fiveHCoins * 1000 + fiveCoins * 5;

        System.out.println(ans);
    }
}