import java.util.*;
import java.lang.Math;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int i = b - a - 1;
        int x = 0;

        for (int ii = 1; ii <= i; ii++) {
            x += ii;
        }
        System.out.println(x - a);
    }
}