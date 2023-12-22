import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = Integer.parseInt(scanner.next());
        int B = Integer.parseInt(scanner.next());
        scanner.close();

        int price = 0;
        if (A >= 13) {
            price = B;
        } else if (A >= 6) {
            price = B /2;
        }

        System.out.println(price);
    }
}
