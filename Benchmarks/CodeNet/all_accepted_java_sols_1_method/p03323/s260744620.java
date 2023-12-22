import java.util.Scanner;

import static java.lang.Integer.max;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        if (max(a, b) <= 8) {
            System.out.println("Yay!");
        }
        else {
            System.out.println(":(");
        }
    }
}
