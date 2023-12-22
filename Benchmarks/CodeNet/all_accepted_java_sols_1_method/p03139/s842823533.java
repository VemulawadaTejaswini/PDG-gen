import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(Math.min(a, b));

        if (a + b < n) {
            System.out.println(0);
        } else {
            System.out.println(Math.abs(a + b - n));
        }


    }

}





