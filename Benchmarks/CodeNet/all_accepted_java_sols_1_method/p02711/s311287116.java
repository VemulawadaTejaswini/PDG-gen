
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n > 0) {
            if (n % 10 == 7) {
                System.out.println("Yes");
                return;
            } else {
                n /= 10;
            }
        }

        System.out.println("No");
    }

}