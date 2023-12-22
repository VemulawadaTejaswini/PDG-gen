import java.util.Scanner;
import java.util.HashMap;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.lang.Math;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (n*a < b) {
            System.out.println(n*a);
        } else {
            System.out.println(b);
        }

    }

}
