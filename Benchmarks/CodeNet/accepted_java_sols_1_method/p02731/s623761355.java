import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double L = sc.nextDouble();

        double k=Math.pow(L / 3, 3);

        System.out.println(k);
    }

}
