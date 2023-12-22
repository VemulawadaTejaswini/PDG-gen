import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long X = sc.nextLong();
        int count = 0;
        double money = 100;
        while (money < X) {
            money += money/100;
            money = Math.floor(money);
            count++;
        }
        System.out.println(count);
    }
}