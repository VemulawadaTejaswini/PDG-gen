import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        int odd = (n * m) & 1;

        if (odd == 1) {
            System.out.println("Odd");
        } else {
            System.out.println("Even");
        }
    }
}
