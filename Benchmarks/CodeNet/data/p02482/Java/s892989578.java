import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer a = sc.nextInt();
        Integer b = sc.nextInt();

            if (a == b) {
                System.out.println("a == b");
            } else if (a > b) {
                System.out.println("a > b");
            } else if (a < b) {
                System.out.println("a < b");
            }

        return;
    }
}