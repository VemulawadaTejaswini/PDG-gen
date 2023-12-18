

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (b % a == 0) {
            System.out.println(a + b);
        } else {
            System.out.println(b - a);
        }
    }
}
