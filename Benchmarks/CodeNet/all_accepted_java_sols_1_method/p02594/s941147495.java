import java.util.*;
import static java.lang.System.*;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int a = sc.nextInt();
        int ab = 30;

        if (a >= ab) {
            System.out.println("Yes");
        } else if (a < ab) {
            System.out.println("No");
        }

    }
}