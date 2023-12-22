import java.lang.Math;
import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        while (sn.hasNext()) {
            int a = sn.nextInt();
            int b = sn.nextInt();
            if (a == 0 && b == 0) {
                break;
            }
            System.out.println(String.format("%d %d", Math.min(a, b), Math.max(a, b)));
        }
    }
}