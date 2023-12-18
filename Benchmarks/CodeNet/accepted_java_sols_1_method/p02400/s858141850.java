import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();

        System.out.printf("%.6f", Math.PI * r * r );
        System.out.print(" ");
        System.out.printf("%.6f", Math.PI * 2 * r);
    }
}

