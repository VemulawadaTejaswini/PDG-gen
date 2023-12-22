import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        while (a > 0) {
            c -= b;

            if (c <= 0) {
                System.out.println("Yes");
                return;
            }
            a -= d;
        }

        System.out.println("No");
    }
}
