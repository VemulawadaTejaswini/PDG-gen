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
        int m = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int[] xx = new int[n];
        int[] yy = new int[m];
        for (int i = 0; i < n; i++) {
            xx[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            yy[i] = sc.nextInt();
        }
        int j = x+1;
        for (int i = 0; i < Math.abs(y-x); i++) {
            boolean flag = true;
            for (int k = 0; k < xx.length; k++) {
                if (xx[k] >= j) {
                    flag = false;
                }
            }
            if (flag) {
                for (int l = 0; l < yy.length; l++) {
                    if (yy[l] < j) {
                        flag = false;
                    }
                }
            }
            if (flag) {
                System.out.println("No War");
                System.exit(0);
            }
            j++;
        }
        System.out.println("War");
    }

}
