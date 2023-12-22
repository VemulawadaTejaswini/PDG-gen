import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String coffeeString = scanner.next();
        if (coffeeString.length() == 6) {

            if (coffeeString.charAt(2) == coffeeString.charAt(3) && coffeeString.charAt(4) == coffeeString.charAt(5)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        } else {
            System.out.println("No");
        }


    }
}