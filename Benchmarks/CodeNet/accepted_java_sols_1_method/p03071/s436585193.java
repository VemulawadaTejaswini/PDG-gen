

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        int x = sc.nextInt();
        int y = sc.nextInt();
        int sum = 0;
        if (x >= y) {
            sum += x;
            x--;
        } else {
            sum += y;
            y--;
        }
        if (x >= y) {
            sum += x;
            x--;
        } else {
            sum += y;
            y--;
        }
        System.out.println(sum);
    }
}
