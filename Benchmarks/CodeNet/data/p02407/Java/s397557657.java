import java.io.*;
import java.util.*;
import java.lang.Math;
import java.util.Arrays;

public class Main {
    public static void main(final String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;
        n = sc.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }
        for (int i = ar.length - 1; i >= 0; i--) {
            System.out.print(ar[i]);
            if (i != 0)
                System.out.print(" ");
        }
        System.out.println();
    }
  
}
