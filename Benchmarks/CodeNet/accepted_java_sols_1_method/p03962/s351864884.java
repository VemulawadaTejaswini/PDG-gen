
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int a, b, c;

        Scanner input = new Scanner(System.in);

        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();

        if (a >= 1 && a <= 100 && b >= 1 && b <= 100 && c >= 1 && c <= 100) { 
            
            if (a != b && b != c && c != a) {

                System.out.println("3");
            } else if (a == b && b == c && c == a) {

                System.out.println("1");

            } else if (a == b || b == c || c == a) {

                System.out.println("2");
            }
        }

    }

}
