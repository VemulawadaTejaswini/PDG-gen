import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int l = scanner.nextInt();

        double d =(double) l/3;
        double v = d*d*d;
        System.out.printf("%.12f\n",v);
       // System.out.println();
    }
}
