
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc;
        String line;
        int p;
        int b;
        char a;
        sc = new Scanner(System.in);
        outer:
        while (true) {

        line = sc.next();
        p = line.length();
        b=0;

            for (int i = 0; i < p; i++) {
                a = line.charAt(i);
                if (p == 1 && a == 48) {
                    break outer;
                }
                b = b + (a - 48);
            }
            System.out.println(b);
        }
    }

}
