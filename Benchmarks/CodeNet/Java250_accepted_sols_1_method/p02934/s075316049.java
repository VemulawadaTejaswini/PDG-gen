import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.lang.Math;

public class Main {

    private static Scanner sc = new Scanner(System.in);
    private static int mod = (int) 10e8 + 7;

    public static void main(String[] args) {
        int n = sc.nextInt();
        // double[] a = new double[n];
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += 1 / sc.nextDouble();
        }
        System.out.println(1 / sum);
    }

}
