

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        long h = sc.nextLong();
        long w = sc.nextLong();
        long ans = h * w / 2;
        if (h * w % 2 == 1) {
            ans++;
        }
        if (h == 1 || w == 1) {
            ans = 1;
        }
        System.out.println(ans);
    }

}
