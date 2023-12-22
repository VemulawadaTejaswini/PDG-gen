import java.util.Scanner;
import java.util.HashMap;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.lang.Math;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        long n = sc.nextLong();
        long a = sc.nextLong();
        long b = sc.nextLong();
        if (a > b) {
            System.out.println(0);
        } else if (a == b) {
            System.out.println(1);
        } else if (n == 1) {
            System.out.println(0);
        } else if (n == 2) {
            System.out.println(1);
        } else {
            System.out.println((b-a)*(n-2)+1);
        }
    }

}
