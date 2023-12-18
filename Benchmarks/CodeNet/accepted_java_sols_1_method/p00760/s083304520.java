import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n != 0) {
            int y = sc.nextInt();
            int m = sc.nextInt();
            int d = sc.nextInt();
            if ((m | y | d) == 0)
                break;
            int c = 0;
            while (y != 1000 || m != 1 || d != 1) {
                c++;
                if (y % 3 == 0) {
                    d++;
                    if (d == 21) {
                        d = 1;
                        m++;
                        if (m == 11) {
                            y++;
                            m = 1;
                        }
                    }
                } else {
                    if (m % 2 != 0) {
                        d++;
                        if (d == 21) {
                            d = 1;
                            m++;
                            if (m == 11) {
                                y++;
                                m = 1;
                            }
                        }
                    } else {
                        d++;
                        if (d == 20) {
                            d = 1;
                            m++;
                            if (m == 11) {
                                y++;
                                m = 1;
                            }
                        }

                    }
                }
            }
            System.out.println(c);
            n--;
        }
    }
}