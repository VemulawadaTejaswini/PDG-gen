import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cash = sc.nextInt();
        int fiveHundredCoin = 0;
        int fiveCoin = 0;
        int Happiness = 0;

        fiveHundredCoin = cash / 500;

        fiveCoin = (cash - fiveHundredCoin * 500)/5;

        Happiness = fiveHundredCoin * 1000 + fiveCoin * 5;

        System.out.println(Happiness);


    }
}