import java.lang.Math;
import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int a = sn.nextInt();
        int b = sn.nextInt();
        if (a == b) {
            System.out.println("a == b");
        } else {
            System.out.println(a > b ? "a > b" : "a < b");
        }
    }
}