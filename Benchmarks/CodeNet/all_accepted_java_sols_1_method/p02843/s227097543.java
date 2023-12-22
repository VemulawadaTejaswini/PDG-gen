import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        int number = x / 100;

        if (x >= 100 * number && 105 * number >= x) {
            System.out.println(1);
            return;
        }
        System.out.println(0);
    }
}