import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = scn.nextInt();
        }

        int min = a[0];
        int max = a[0];
        long sum = a[0];

        for (int i = 1; i < (n); i++) {
            min = Math.min(min,a[i]);
            max = Math.max(max,a[i]);
            sum = sum + (long)a[i];
        }

        System.out.println(min+" "+max+" "+sum);

        scn.close();


    }
}
