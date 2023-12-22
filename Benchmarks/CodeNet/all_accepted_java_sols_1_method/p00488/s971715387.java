
import java.util.*;

class Main {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        int e = scan.nextInt();
        int f = 0;
        if (a < b && a < c) {
            f = a;
        } else if (b < c) {
            f = b;
        } else {
            f = c;
        }
        if (d < e) {
            f = f + d - 50;
        } else {
            f = f + e - 50;
        }
        System.out.println(f);
    }
}

