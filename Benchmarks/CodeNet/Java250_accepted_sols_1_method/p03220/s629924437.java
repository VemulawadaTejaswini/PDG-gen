import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int a = sc.nextInt();
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = sc.nextInt();
        }
        double min = Double.MAX_VALUE;
        int minIndex = 0;
        for (int i = 0; i < n; i++) {
            double temp = t - l[i] * 0.006;
            if (Math.abs(temp - a) < min) {
                min = Math.abs(temp - a);
                minIndex = i;
            }

        }

        System.out.println(minIndex + 1);
    }
}