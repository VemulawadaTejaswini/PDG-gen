import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class A {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner in = new Scanner(System.in);
//        Scanner in = new Scanner(new File("input.txt"));

        int a = in.nextInt();
        int b = in.nextInt();

        System.out.println(a * b);
    }

    private static boolean isValid(int a, int b, int c) {
        if (a + b <= c || a + c <= b || b + c <= a) {
            return false;
        }

        return true;
    }
}
