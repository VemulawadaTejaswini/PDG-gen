import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a * 4 - 2 >= b && a % 2 == 0 && b % 10 == 0 || b % 8 == 0 || b % 4 == 0) {
            System.out.println("Yes");
        } else if (a * 4 - 2 >= b && a % 2 == 1 && b % 10 == 0 || b % 8 == 0 || b % 4 == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        sc.close();
    }
}