import java.lang.Math;
import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int a = sn.nextInt();
        int b = sn.nextInt();
        int c = sn.nextInt();
        int co = 0;
        for (int i = a; i <= b; i++) {
            if (c % i != 0) {
                continue;
            }
            co++;
        }
        System.out.println(co);
    }
}