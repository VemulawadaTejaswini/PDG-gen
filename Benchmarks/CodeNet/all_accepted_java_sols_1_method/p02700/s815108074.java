import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        boolean t = false;
        while (a > 0 && c > 0) {
            t ^= true;
            if (t) {
                c -= b;
            } else {
                a -= d;
            }
        }
        System.out.println(t ? "Yes" : "No");
    }
}