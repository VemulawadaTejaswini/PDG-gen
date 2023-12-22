import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();
        int price = sc.nextInt();

        if (age >= 13) {
            System.out.println(price);
        } else if (age > 5) {
            System.out.println(price / 2);
        } else {
            System.out.println(0);
        }

        sc.close();
    }
}