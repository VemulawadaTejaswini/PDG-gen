

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        long a = sc.nextLong();
        int res = (int) a;
        for (int i = 0; i <= a; i++) {
            int cc = 0;
            int t = i;
            while (t > 0) {
                cc += t % 6;
                t = t / 6;
            }
            t = (int) a - i;
            while (t > 0) {
                cc += t % 9;
                t = t / 9;
            }
            if (res > cc) {
                res = cc;
            }
        }
        System.out.println(res);
    }
}
