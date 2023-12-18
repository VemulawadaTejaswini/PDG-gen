import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a = 1;

        for (int i = n; i > 0; i--) {
            if (a % 3 == 0) {
                System.out.print(" " + a);
            } else {
                int x = a;
                while (x != 0) {
                    if (x % 10 == 3) {
                        System.out.print(" " + a);
                    }
                    x /= 10;
                }
            }
            a++;
        }
        System.out.println();
    }
}