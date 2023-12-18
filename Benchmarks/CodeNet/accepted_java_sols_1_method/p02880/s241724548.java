

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        boolean flg = false;

        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                if (i * j == n) {
                    flg = true;
                    break;
                }
            }
        }

        if (flg) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        sc.close();
    }
}