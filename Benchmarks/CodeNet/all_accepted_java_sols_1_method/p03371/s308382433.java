

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int res = Integer.MAX_VALUE;

        for(int i = 0; i <= 100000; i++) {
            res = Math.min(res, (i * C * 2) + (Math.max(0, X - i) * A) + (Math.max(0, Y - i) * B));
        }
        System.out.println(res);
    }
}
