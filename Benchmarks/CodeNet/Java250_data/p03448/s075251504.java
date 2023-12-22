import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fiveHundred = Integer.parseInt(scanner.nextLine());
        int hundred = Integer.parseInt(scanner.nextLine());
        int fifty = Integer.parseInt(scanner.nextLine());
        int money = Integer.parseInt(scanner.nextLine());

        if (money % 100 == 50) {
            if (fifty == 0) {
                System.out.println(0);
                System.exit(0);
            }
            fifty -= 1;
            money -= 50;
        }

        int total = 0;
        if (money >= 500) {
            for (int i = Math.min(fiveHundred, Math.floorDiv(money, 500)); i >= 0; i--) {
                total += countUp(money - (500 * i), hundred, fifty);
            }
        } else {
            total = countUp(money, hundred, fifty);
        }
        System.out.println(total);
    }

    public static int countUp(int sum, int hundred, int fifty) {
        int c = 0;
        for (int i = Math.min(hundred, sum / 100); i >= 0; i--) {
            if ((sum - (i * 100)) <= (fifty * 50)) {
                c++;
            }
        }
        return c;
    }
}