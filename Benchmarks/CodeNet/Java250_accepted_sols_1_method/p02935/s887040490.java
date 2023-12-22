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
        double[] a = new double[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextDouble();
        }
        Arrays.sort(a);
        double sum = (a[0] + a[1]) / 2;
        for (int i = 2; i < n; i++) {
            sum = (sum + a[i]) / 2;
        }
        System.out.println(sum);
    }

}
