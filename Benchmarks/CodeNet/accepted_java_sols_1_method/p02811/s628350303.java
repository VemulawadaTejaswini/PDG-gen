import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfCoins = scanner.nextInt();
        int sum = scanner.nextInt();
        if (numberOfCoins * 500 >= sum) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}