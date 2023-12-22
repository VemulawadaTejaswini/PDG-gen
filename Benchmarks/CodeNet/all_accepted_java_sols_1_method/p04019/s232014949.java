import java.util.Scanner;
import java.util.HashMap;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.lang.Math;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String s = sc.next();
        if (s.contains("S")) {
            if (!s.contains("N")) {
                System.out.println("No");
                System.exit(0);
            }
        }
        if (s.contains("N")) {
            if (!s.contains("S")) {
                System.out.println("No");
                System.exit(0);
            }
        }
        if (s.contains("E")) {
            if (!s.contains("W")) {
                System.out.println("No");
                System.exit(0);
            }
        }
        if (s.contains("W")) {
            if (!s.contains("E")) {
                System.out.println("No");
                System.exit(0);
            }
        }
        System.out.println("Yes");
    }

}
