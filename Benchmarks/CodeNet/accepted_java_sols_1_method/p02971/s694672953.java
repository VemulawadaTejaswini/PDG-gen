import java.util.Scanner;
import java.util.HashMap;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] newa = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            int tmp = a[i];
            newa[i] = tmp;
        }
        Arrays.sort(a);
        int max = a[n-1];
        int max_2 = a[n-2];
        for (int i = 0; i < n; i++) {
            if(newa[i] == max) {
                System.out.println(max_2);
            } else {
                System.out.println(max);
            }
        }
    }

}
