//Created by Aminul on 7/5/2020.

import java.io.*;
import java.util.*;

import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int n = in.nextInt();
        long sum = 0, min = Long.MAX_VALUE;
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        shuffle(arr);
        Arrays.sort(arr);

        sum += arr[n - 1];
        for (int i = n - 2, j = 1; i >= 0 && j < n - 1; i--) {
            sum += arr[i];
            j++;
            if (j < n - 1) {
                sum += arr[i];
                j++;
            }
        }

        pw.println(sum);
        pw.close();
    }

    public static void shuffle(int[] a) {
        Random rnd = new Random();
        for (int i = a.length - 1; i >= 1; i--) {
            int j = rnd.nextInt(i + 1);
            int t = a[i];
            a[i] = a[j];
            a[j] = t;
        }
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}