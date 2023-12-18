

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        int d = sc.nextInt();
        int n = sc.nextInt();

        if (d == 0) {
            if (n == 100) {
                n++;
            }
            System.out.println(n);
        } else {
            if (n == 100) {
                n++;
            }
            System.out.println((long) Math.pow(100, d) * n);
        }
    }
}
