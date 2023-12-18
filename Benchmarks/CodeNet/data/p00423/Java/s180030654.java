import java.util.*;

class Main {
    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();
            if (n == 0) break;

            int a = 0;
            int b = 0;
            int ac, bc;

            for(int x = 0; x < n; x++) {
                ac = sc.nextInt();
                bc = sc.nextInt();
                if (ac > bc) {
                    a += ac + bc;
                } else if (ac < bc) {
                    b += ac + bc;
                } else {
                    a += ac;
                    b += bc;
                }
            }

            System.out.printf("%d %d\n", a, b);
        }

    }
}