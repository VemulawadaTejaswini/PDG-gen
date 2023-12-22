

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int x = sc.nextInt();
        boolean answer = false;
        outside:
        while (!answer) {
            for (int i = 2; i < x; i++) {
                if (x % i == 0) {
                    x++;
                    continue outside;
                }
            }
            answer = true;
        }
        System.out.println(x);
    }
}
