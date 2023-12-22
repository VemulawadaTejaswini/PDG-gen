import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner input =new Scanner(System.in);

        int coins = input.nextInt();
        int fiveHumHappy = coins/500;
        int remainder = coins%500;
        int fiveHapyy = remainder/5;

        System.out.println(((fiveHapyy*5)+(fiveHumHappy*1000)));
    }
}
