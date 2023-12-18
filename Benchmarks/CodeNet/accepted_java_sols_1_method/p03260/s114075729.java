
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = 0;
        int res = 0;
        if (a % 2 == 1 && b % 2 == 1 && a > b) {

            for (int i = b + 1; i <= a; i++) {
                if (i % 2 == 1) {
                    c = i;
                    res = a * b * c;
                    //   System.out.println(res);

                    break;
                }

            }

            if (res % 2 == 1) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        } else if (a % 2 == 1 && b % 2 == 1 && a <= b) {
            if (a < b) {
                for (int i = a + 1; i <= b; i++) {
                    if (i % 2 == 1) {
                        c = i;
                        res = a * b * c;
                        // System.out.println(res);

                        break;
                    }

                }
                if (res % 2 == 1) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            } else {
                //System.out.println(a * b * (c+1));
                System.out.println("Yes");
            }
        } else {
            System.out.println("No");
        }
    }

}
